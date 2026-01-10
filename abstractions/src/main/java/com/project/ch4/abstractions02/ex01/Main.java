package com.project.ch4.abstractions02.ex01;

import com.project.ch4.abstractions02.ex01.configuration.ProjectConfiguration;
import com.project.ch4.abstractions02.ex01.model.Comment;
import com.project.ch4.abstractions02.ex01.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        var commentRepository = new DBCommentRepository();
//        var commentNotificationProxy = new EmailCommentNotificationProxy();
//        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
