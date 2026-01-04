package com.project.ch4.abstractions02;

import com.project.ch4.abstractions02.configuration.ProjectConfiguration;
import com.project.ch4.abstractions02.model.Comment;
import com.project.ch4.abstractions02.proxies.EmailCommentNotificationProxy;
import com.project.ch4.abstractions02.repositories.DBCommentRepository;
import com.project.ch4.abstractions02.services.CommentService;
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
