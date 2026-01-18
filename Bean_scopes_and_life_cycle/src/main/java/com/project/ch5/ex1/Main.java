package com.project.ch5.ex1;

import com.project.ch5.ex1.config.ProjectConfig;
import com.project.ch5.ex1.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var bean1 = context.getBean("commentService", CommentService.class);
        var bean2 = context.getBean("commentService", CommentService.class);
        System.out.println("bean1 == bean2 ? " + (bean1 == bean2));
    }
}
