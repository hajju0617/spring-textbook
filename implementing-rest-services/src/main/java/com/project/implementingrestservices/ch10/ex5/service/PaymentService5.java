package com.project.implementingrestservices.ch10.ex5.service;

import com.project.implementingrestservices.ch10.ex5.exception.NotEnoughMoneyException5;
import com.project.implementingrestservices.ch10.ex5.model.PaymentDetails5;
import org.springframework.stereotype.Service;

@Service
public class PaymentService5 {
    public PaymentDetails5 processPayment() {
        throw new NotEnoughMoneyException5();
    }
}
