package com.project.ch3.wiring02.ex01.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";

    // ↓ 실무에서 바람직하지 않음. Why? -> final로 만들 수 없음. (초깃값 없이는 final 필드를 정의할 수 없기 때문에 컴파일 에러 발생함.)
    @Autowired
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

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
