package com.project.ch3.wiring03.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";
    private final Person person;
    @Autowired
    public Parrot(Person person) {      // Parrot 인스턴스 생성할 때 Person 빈이 필요함. (순환 참조, circular reference)
        this.person = person;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person getPerson() {
        return person;
    }
    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
