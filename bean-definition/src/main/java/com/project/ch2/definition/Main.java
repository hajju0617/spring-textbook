package com.project.ch2.definition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // ↓ 스프링 컨텍스트의 인스턴스를 생성.
        var context = new AnnotationConfigApplicationContext();

        Parrot parrot = new Parrot();
    }
}