package com.project.implementingrestservices.ch10.ex2.controller;

import com.project.implementingrestservices.ch10.ex2.model.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
class CountryController2Test {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void france() throws Exception {
        Country country = Country.of("France", 67);
        ObjectMapper objectMapper = new ObjectMapper();
        String body = objectMapper.writeValueAsString(country);

        mockMvc.perform(MockMvcRequestBuilders.get("/france"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(body));
    }

    @Test
    void countryList() throws Exception {
        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("Spain", 77);
        Country c3 = Country.of("Japan", 82);
        Country c4 = Country.of("South Korea", 95);
        Country c5 = Country.of("China", 40);

        ObjectMapper objectMapper = new ObjectMapper();
        String body = objectMapper.writeValueAsString(List.of(c1, c2, c3, c4, c5));
        mockMvc.perform(MockMvcRequestBuilders.get("/all"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json(body));
    }
}