package com.project.implementingrestservices.ch10.ex4.controller;

import com.project.implementingrestservices.ch10.ex4.exception.NotEnoughMoneyException;
import com.project.implementingrestservices.ch10.ex4.model.ErrorDetails;
import com.project.implementingrestservices.ch10.ex4.model.PaymentDetails;
import com.project.implementingrestservices.ch10.ex4.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import tools.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class PaymentControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockitoBean        // @MockBean 대신 사용
    private PaymentService paymentService;

    @Test
    void makePaymentSuccessful() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        PaymentDetails p = new PaymentDetails();
        p.setAmount(1000);

        Mockito.when(paymentService.processPayment()).thenReturn(p);
        String body = objectMapper.writeValueAsString(p);
        mockMvc.perform(MockMvcRequestBuilders.post("/payment"))
                .andExpect(MockMvcResultMatchers.status().isAccepted())
                .andExpect(MockMvcResultMatchers.content().json(body));
    }
    @Test
    void testMakePaymentNotEnoughMoney() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        ErrorDetails e = new ErrorDetails();
        e.setMessage("Not enough money to make the payment");

        Mockito.when(paymentService.processPayment())
                .thenThrow(new NotEnoughMoneyException());

        String body = mapper.writeValueAsString(e);

        mockMvc.perform(MockMvcRequestBuilders.post("/payment"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest())
                .andExpect(MockMvcResultMatchers.content().json(body));
    }
}