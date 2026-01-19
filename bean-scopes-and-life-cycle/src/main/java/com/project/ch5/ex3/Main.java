package com.project.ch5.ex3;

import com.project.ch5.ex3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // 스프링 컨텍스트만 생성해도 'CommentService' 생성자가 호출됨.
    }
}
