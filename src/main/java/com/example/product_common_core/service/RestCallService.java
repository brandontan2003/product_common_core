package com.example.product_common_core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCallService {
    @Autowired
    private RestTemplate restTemplate;

    public <T> ResponseEntity<T> fetchApiResponseEntity(String url, HttpMethod method, Object requestBody,
                                                        ParameterizedTypeReference<T> responseType) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> requestEntity = new HttpEntity<>(requestBody, headers);

        return restTemplate.exchange(
                url,
                method,
                requestEntity,
                responseType
        );
    }

    public <T> T fetchApiResponseBody(String url, HttpMethod method, Object requestBody,
                                      ParameterizedTypeReference<T> responseType) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> requestEntity = new HttpEntity<>(requestBody, headers);

        return restTemplate.exchange(
                url,
                method,
                requestEntity,
                responseType
        ).getBody();
    }
}
