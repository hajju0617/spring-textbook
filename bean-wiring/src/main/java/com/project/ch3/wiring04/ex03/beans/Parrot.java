package com.project.ch3.wiring04.ex03.beans;


public class Parrot {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
