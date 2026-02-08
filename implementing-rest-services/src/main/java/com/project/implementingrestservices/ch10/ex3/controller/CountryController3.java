package com.project.implementingrestservices.ch10.ex3.controller;

import com.project.implementingrestservices.ch10.ex3.model.Country3;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController3 {
    @GetMapping("/france3")
    public ResponseEntity<Country3> france() {
        Country3 c = Country3.of("France", 67);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .header("favorite_food", "cheese and wine")
                .body(c);
    }
}
