package com.springboot.dto;
import com.springboot.dto.orderviewrs.OrderViewRS;

public class OrderEmailRequest {
    private String email;
    private OrderViewRS order;
    private String pdfBase64;

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public OrderViewRS getOrder() { return order; }
    public void setOrder(OrderViewRS order) { this.order = order; }

    public String getPdfBase64() { return pdfBase64; }
    public void setPdfBase64(String pdfBase64) { this.pdfBase64 = pdfBase64; }
}
