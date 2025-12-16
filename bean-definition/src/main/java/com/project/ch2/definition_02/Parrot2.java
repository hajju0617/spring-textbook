package com.project.ch2.definition_02;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// 스프링은 해당 클래스의 인스턴스를 생성하고 스프링 컨텍스트에 추가함.
@Component      // 스프링 컨텍스트에 해당 클래스의 인스턴스를 추가하도록 지시함.
public class Parrot2 {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct      // stereotype 빈 등록임에도 'PostConstruct'에노테이션을 사용하면 해당 빈을 생성한 후 스프링이 실행하는 일련의 명령을 지정할 수 있음.
    public void init() {
        this.name = "Kiki";
    }
}
