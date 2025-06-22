package com.springboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NdcService {

    private final RestTemplate restTemplate;

    @Value("${ndc.api.secret-key}")
    private String secretKey;

    @Value("${ndc.api.password}")
    private String password;

    public NdcService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public <TRequest, TResponse> TResponse sendNdcRequest(
            TRequest request,
            Class<TResponse> responseClass,
            String url
    ) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_XML);
            headers.setAccept(List.of(MediaType.APPLICATION_XML));
            headers.add("SECRET-KEY", secretKey);
            headers.add("PASSWORD", password);

            HttpEntity<TRequest> entity = new HttpEntity<>(request, headers);

            return restTemplate.exchange(
                    url,
                    HttpMethod.POST,
                    entity,
                    responseClass
            ).getBody();

        } catch (Exception e) {
            if (e instanceof HttpClientErrorException) {
                System.err.println("Remote 403 body: " + ((HttpClientErrorException) e).getResponseBodyAsString());
            }
            throw new RuntimeException("NDC request failed", e);
        }

    }
}
