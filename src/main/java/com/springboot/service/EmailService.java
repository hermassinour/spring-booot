package com.springboot.service;

import com.springboot.dto.orderviewrs.OrderViewRS;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

@Service
public class EmailService {

    @Value("${mailgun.api.key}")
    private String mailgunApiKey;

    @Value("${mailgun.domain}")
    private String mailgunDomain;

    @Value("${mailgun.sender}")
    private String mailgunSender;

    public void sendOrderConfirmationEmail(String toEmail, OrderViewRS order, String pdfBase64) throws IOException {
        byte[] pdfBytes = Base64.getDecoder().decode(pdfBase64);

        String pnr = "unknownPNR";
        if (order.getPayloadAttributes() != null) {
            if (order.getPayloadAttributes().getCorrelationID() != null) {
                pnr = order.getPayloadAttributes().getCorrelationID();
            } else if (order.getPayloadAttributes().getTrxID() != null) {
                pnr = order.getPayloadAttributes().getTrxID();
            }
        }

        System.out.println("sendOrderConfirmationEmail called");
        System.out.println("To: " + toEmail);
        if (order != null) {
            System.out.println("Order PNR (correlationID/trxID): " +
                    (order.getPayloadAttributes() != null
                            ? order.getPayloadAttributes().getCorrelationID() + "/" + order.getPayloadAttributes().getTrxID()
                            : "null"));
        } else {
            System.out.println("Order object is null");
        }
        System.out.println("PDF Base64 length: " + (pdfBase64 != null ? pdfBase64.length() : "null"));

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addTextBody("from", mailgunSender);
        builder.addTextBody("to", toEmail);
        builder.addTextBody("subject", "Your Flight Booking Confirmation");
        builder.addTextBody("text", "Dear customer, please find your booking confirmation attached.");
        builder.addBinaryBody(
                "attachment", pdfBytes,
                ContentType.create("application/pdf"),
                "confirmation_" + pnr + ".pdf"
        );

        HttpEntity entity = builder.build();

        HttpPost request = new HttpPost("https://api.mailgun.net/v3/" + mailgunDomain + "/messages");
        request.setEntity(entity);

        String auth = "api:" + mailgunApiKey;
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.ISO_8859_1));
        String authHeader = "Basic " + new String(encodedAuth);
        request.setHeader("Authorization", authHeader);

        try (CloseableHttpClient client = HttpClients.createDefault();
             CloseableHttpResponse response = client.execute(request)) {
            if (response.getStatusLine().getStatusCode() >= 400) {
                throw new RuntimeException("Failed to send email: " + response.getStatusLine());
            }
        }
    }
    public void sendResetPasswordEmail(String toEmail, String resetLink) throws IOException {
        System.out.println("Sending password reset email to: " + toEmail);
        System.out.println("Reset link: " + resetLink);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addTextBody("from", mailgunSender);
        builder.addTextBody("to", toEmail);
        builder.addTextBody("subject", "🔐 Password Reset Request");
        builder.addTextBody("text", "Hello,\n\nWe received a request to reset your password.\n" +
                "To reset it, click the following link:\n" + resetLink + "\n\n" +
                "If you did not request this, you can ignore this email.");

        HttpEntity entity = builder.build();

        HttpPost request = new HttpPost("https://api.mailgun.net/v3/" + mailgunDomain + "/messages");
        request.setEntity(entity);

        String auth = "api:" + mailgunApiKey;
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.ISO_8859_1));
        String authHeader = "Basic " + new String(encodedAuth);
        request.setHeader("Authorization", authHeader);

        try (CloseableHttpClient client = HttpClients.createDefault();
             CloseableHttpResponse response = client.execute(request)) {
            if (response.getStatusLine().getStatusCode() >= 400) {
                throw new RuntimeException("Failed to send password reset email: " + response.getStatusLine());
            }
        }
    }
}
