package com.project.ch2.definition_01;

import com.project.ch2.definition_01.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // ↓ 스프링 컨텍스트의 인스턴스를 생성. (구성 클래스를 매개변수로 전송하여 스프링이 이를 사용하도록 지시.)
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);      // 스프링 컨텍스트에서 Parrot 타입의 빈 참조를 가져옴.
        System.out.println("parrot.getName() = " + parrot.getName());

        String string = context.getBean(String.class);
        System.out.println("string = " + string);

        Integer integer = context.getBean(Integer.class);
        System.out.println("integer = " + integer);
    }
}