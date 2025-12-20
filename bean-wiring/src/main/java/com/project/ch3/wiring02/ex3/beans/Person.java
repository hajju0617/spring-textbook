package com.project.ch3.wiring02.ex3.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";

    private Parrot parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }
    // setter를 이용한 의존성 주입. (장점보다 단점이 더 많음.)
    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

}
