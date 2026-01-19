package com.project.ch5.ex4;

import com.project.ch5.ex4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // @Lazy 에노테이션으로 인해 스프링 컨텍스트만 생성할 시 'CommentService' 생성자가 호출되지 않음.
    }
}
