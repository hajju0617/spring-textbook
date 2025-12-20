package com.project.ch3.wiring03.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";
    private final Parrot parrot;

    @Autowired
    public Person(Parrot parrot) {  // Person 인스턴스 생성할 때 Parrot 빈이 필요함. (순환 참조, circular reference)
        this.parrot = parrot;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Parrot getParrot() {
        return parrot;
    }
}
