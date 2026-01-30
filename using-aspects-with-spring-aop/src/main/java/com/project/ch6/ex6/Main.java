package com.project.ch6.ex6;

import com.project.ch6.ex6.config.ProjectConfig;
import com.project.ch6.ex6.model.Comment;
import com.project.ch6.ex6.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);

    }
}
