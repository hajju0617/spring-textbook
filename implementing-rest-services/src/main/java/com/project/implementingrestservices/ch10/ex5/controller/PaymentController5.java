package com.project.implementingrestservices.ch10.ex5.controller;

import com.project.implementingrestservices.ch10.ex5.exception.NotEnoughMoneyException5;
import com.project.implementingrestservices.ch10.ex5.model.ErrorDetails5;
import com.project.implementingrestservices.ch10.ex5.model.PaymentDetails5;
import com.project.implementingrestservices.ch10.ex5.service.PaymentService5;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController5 {
    private final PaymentService5 paymentService5;

    public PaymentController5(PaymentService5 paymentService5) {
        this.paymentService5 = paymentService5;
    }

    @PostMapping("/payment5")
    public ResponseEntity<?> makePayment() {
        PaymentDetails5 p = paymentService5.processPayment();
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(p);
    }
}
