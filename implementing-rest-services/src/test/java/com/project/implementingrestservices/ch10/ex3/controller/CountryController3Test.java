package com.project.implementingrestservices.ch10.ex3.controller;

import com.project.implementingrestservices.ch10.ex3.model.Country3;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import tools.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class CountryController3Test {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void france() throws Exception {
        Country3 c = Country3.of("France", 67);
        ObjectMapper objectMapper = new ObjectMapper();
        String body = objectMapper.writeValueAsString(c);
        mockMvc.perform(MockMvcRequestBuilders.get("/france3"))
                .andExpect(MockMvcResultMatchers.status().isAccepted())
                .andExpect(MockMvcResultMatchers.content().json(body))
                .andExpect(MockMvcResultMatchers.header().string("continent", "Europe"))
                .andExpect(MockMvcResultMatchers.header().string("capital", "Paris"))
                .andExpect(MockMvcResultMatchers.header().string("favorite_food", "cheese and wine"));
    }
}