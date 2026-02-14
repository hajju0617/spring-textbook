package com.project.consumingrestendpoints.ch11.ex1.controller;

import com.project.consumingrestendpoints.ch11.ex1.model.Payment1;
import com.project.consumingrestendpoints.ch11.ex1.proxy.PaymentsProxy1;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentsController1 {
    private final PaymentsProxy1 paymentsProxy1;

    public PaymentsController1(PaymentsProxy1 paymentsProxy1) {
        this.paymentsProxy1 = paymentsProxy1;
    }
    @PostMapping("/payment1")
    public Payment1 createPayment(@RequestBody Payment1 payment1) {
        System.out.println("@@@@@@@@@@@@@@@@@@payment1 = " + payment1);
        String requestId = UUID.randomUUID().toString();
        return paymentsProxy1.createPayment(requestId, payment1);
    }
}
