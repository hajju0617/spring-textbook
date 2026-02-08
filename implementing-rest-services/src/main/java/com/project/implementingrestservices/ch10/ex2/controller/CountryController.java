package com.project.implementingrestservices.ch10.ex2.controller;

import com.project.implementingrestservices.ch10.ex2.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class CountryController {
    @GetMapping("/france")
    public Country france() {
        return Country.of("France", 67);
    }

    @GetMapping("/all")
    public List<Country> countryList() {
        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("Spain", 77);
        Country c3 = Country.of("Japan", 82);
        Country c4 = Country.of("South Korea", 95);
        Country c5 = Country.of("China", 40);
        return List.of(c1, c2, c3, c4, c5);
    }
}
