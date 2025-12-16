package com.project.ch2.definition_02;

import com.project.ch2.definition_02.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // ↓ 스프링 컨텍스트의 인스턴스를 생성. (구성 클래스를 매개변수로 전송하여 스프링이 이를 사용하도록 지시.)
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


    }
}