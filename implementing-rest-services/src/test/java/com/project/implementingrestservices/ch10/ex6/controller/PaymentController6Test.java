package com.project.implementingrestservices.ch10.ex6.controller;

import com.project.implementingrestservices.ch10.ex6.model.PaymentDetails6;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import tools.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class PaymentController6Test {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void makePayment() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        PaymentDetails6 p = new PaymentDetails6();
        p.setAmount(1000);
        String body = objectMapper.writeValueAsString(p);

        mockMvc.perform(MockMvcRequestBuilders.post("/payment6").content(body).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isAccepted())
                .andExpect(MockMvcResultMatchers.content().json(body));
    }
}