package com.project.implementingrestservices.ch10.ex6.controller;

import com.project.implementingrestservices.ch10.ex6.model.PaymentDetails6;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController6 {
    private static Logger logger =
            Logger.getLogger(PaymentController6.class.getName());
    @PostMapping("/payment6")
    public ResponseEntity<PaymentDetails6> makePayment(@RequestBody PaymentDetails6 p) {
        logger.info("Received payment: " + p.getAmount());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(p);
    }
}
