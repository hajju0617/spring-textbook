package com.project.ch4.abstractions03;

import com.project.ch4.abstractions03.configuration.ProjectConfiguration;
import com.project.ch4.abstractions03.model.Comment;
import com.project.ch4.abstractions03.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        System.out.println("====================================");
        // 등록된 모든 빈 이름 가져오기.
        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("컨테이너에 등록된 빈 목록:");
        for (String name : beanNames) {
            Object bean = context.getBean(name);
            System.out.println("Bean Name: " + name + " | Type: " + bean.getClass().getName());
        }
        System.out.println("====================================");

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
