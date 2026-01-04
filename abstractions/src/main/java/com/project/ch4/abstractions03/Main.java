package com.project.ch4.abstractions03;

import com.project.ch4.abstractions03.configuration.ProjectConfiguration;
import com.project.ch4.abstractions03.model.Comment;
import com.project.ch4.abstractions03.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
