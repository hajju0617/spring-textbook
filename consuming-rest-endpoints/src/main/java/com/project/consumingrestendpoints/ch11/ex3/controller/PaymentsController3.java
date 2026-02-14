package com.project.consumingrestendpoints.ch11.ex3.controller;

import com.project.consumingrestendpoints.ch11.ex3.model.Payment3;
import com.project.consumingrestendpoints.ch11.ex3.proxy.PaymentsProxy3;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
public class PaymentsController3 {
    private final PaymentsProxy3 paymentsProxy3;

    public PaymentsController3(PaymentsProxy3 paymentsProxy3) {
        this.paymentsProxy3 = paymentsProxy3;
    }
    @PostMapping("/payment3")
    public Mono<Payment3> createPayment(@RequestBody Payment3 payment3) {
        String requestId = UUID.randomUUID().toString();
        return paymentsProxy3.createPayment(requestId, payment3);
    }
}
