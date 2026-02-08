package com.project.implementingrestservices.ch10.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {
    @GetMapping("/hello2")
    public String hello() {
        return "Hello";
    }
    @GetMapping("/ciao2")
    public String ciao() {
        return "Ciao";
    }
}
