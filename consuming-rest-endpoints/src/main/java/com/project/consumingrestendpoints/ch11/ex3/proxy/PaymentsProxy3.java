package com.project.consumingrestendpoints.ch11.ex3.proxy;

import com.project.consumingrestendpoints.ch11.ex3.model.Payment3;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Component
public class PaymentsProxy3 {
    private final WebClient webClient;
    @Value("${name.service.url}")
    private String paymentsServiceUrl;

    public PaymentsProxy3(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<Payment3> createPayment(String requestId,
                                        Payment3 payment3) {
        return webClient.post()
                // 호출 URI
                .uri(paymentsServiceUrl + "/payment")
                // 요청 HTTP 헤더
                .header("requestId", requestId)
                // 요청 바디
                .body(Mono.just(payment3), Payment3.class)
                // HTTP 요청 전송 & HTTP 응답 수신
                .retrieve()
                // HTTP 응답 바디 가져옴.
                .bodyToMono(Payment3.class);
    }
}
