package com.project.ch3.wiring02.ex02.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";

    // ↓ 실무에서 자주 이용되는 방식. Why? ->  필드를 final로 지정할 수 있음. (초기화 이후에는 값을 변경할 수 없음.)
    private final Parrot parrot;
    @Autowired
    public Person(Parrot parrot) {
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
