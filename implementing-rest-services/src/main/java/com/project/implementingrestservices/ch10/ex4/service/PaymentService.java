package com.project.implementingrestservices.ch10.ex4.service;

import com.project.implementingrestservices.ch10.ex4.exception.NotEnoughMoneyException;
import com.project.implementingrestservices.ch10.ex4.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
