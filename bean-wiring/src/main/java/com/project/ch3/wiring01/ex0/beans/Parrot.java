package com.project.ch3.wiring01.ex0.beans;

public class Parrot {
    private String name;

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
