package com.project.ch2.definition03;

import org.springframework.stereotype.Component;

// 스프링은 해당 클래스의 인스턴스를 생성하고 스프링 컨텍스트에 추가함.
@Component      // 스프링 컨텍스트에 해당 클래스의 인스턴스를 추가하도록 지시함.
public class Parrot {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
