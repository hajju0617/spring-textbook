package com.project.ch4.abstractions04;

import com.project.ch4.abstractions04.configuration.ProjectConfiguration;
import com.project.ch4.abstractions04.model.Comment;
import com.project.ch4.abstractions04.services.CommentService;
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
