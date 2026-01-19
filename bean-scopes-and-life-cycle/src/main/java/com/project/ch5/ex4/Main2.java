package com.project.ch5.ex4;

import com.project.ch5.ex4.config.ProjectConfig;
import com.project.ch5.ex4.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the CommentService");
        // @Lazy 에노테이션을 사용했지만 'CommentService' 빈을 요청했으므로 빈(Bean)을 생성하기 위해 'CommentService' 생성자가 호출됨.
        var service = context.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");
    }
}
