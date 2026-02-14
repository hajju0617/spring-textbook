package com.project.consumingrestendpoints.ch11.ex2.controller;

import com.project.consumingrestendpoints.ch11.ex2.model.Payment2;
import com.project.consumingrestendpoints.ch11.ex2.proxy.PaymentsProxy2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsController2 {
    private final PaymentsProxy2 paymentsProxy2;

    public PaymentsController2(PaymentsProxy2 paymentsProxy2) {
        this.paymentsProxy2 = paymentsProxy2;
    }
    @PostMapping("/payment2")
    public Payment2 createPayment(@RequestBody Payment2 payment2) {
        return paymentsProxy2.createPayment(payment2);
    }
}
