package com.project.ch4.abstractions01;

import com.project.ch4.abstractions01.model.Comment;
import com.project.ch4.abstractions01.proxies.EmailCommentNotificationProxy;
import com.project.ch4.abstractions01.repositories.DBCommentRepository;
import com.project.ch4.abstractions01.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");
        commentService.publishComment(comment);
    }
}
