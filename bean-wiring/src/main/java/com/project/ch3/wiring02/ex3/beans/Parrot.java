package com.project.ch3.wiring02.ex3.beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "Parrot: " + this.name;
    }
}
