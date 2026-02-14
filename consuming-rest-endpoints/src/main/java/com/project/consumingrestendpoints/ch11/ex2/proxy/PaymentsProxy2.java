package com.project.consumingrestendpoints.ch11.ex2.proxy;

import com.project.consumingrestendpoints.ch11.ex2.model.Payment2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
public class PaymentsProxy2 {
    private final RestTemplate restTemplate;
    @Value("${name.service.url}")
    private String paymentsServiceUrl;

    public PaymentsProxy2(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Payment2 createPayment(Payment2 payment2) {
        String uri = paymentsServiceUrl + "/payment";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("requestId", UUID.randomUUID().toString());

        HttpEntity<Payment2> httpEntity = new HttpEntity<>(payment2, httpHeaders);

        ResponseEntity<Payment2> responseEntity =
                restTemplate.exchange(uri,
                                      HttpMethod.POST,
                                      httpEntity,
                                      Payment2.class);
        return responseEntity.getBody();
    }
}
