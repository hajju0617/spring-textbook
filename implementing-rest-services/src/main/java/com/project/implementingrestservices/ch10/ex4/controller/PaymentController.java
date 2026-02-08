package com.project.implementingrestservices.ch10.ex4.controller;

import com.project.implementingrestservices.ch10.ex4.exception.NotEnoughMoneyException;
import com.project.implementingrestservices.ch10.ex4.model.ErrorDetails;
import com.project.implementingrestservices.ch10.ex4.model.PaymentDetails;
import com.project.implementingrestservices.ch10.ex4.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
        try {
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
        } catch (NotEnoughMoneyException ne) {
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not enough money to make the payment");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(errorDetails);
        }
    }
}
