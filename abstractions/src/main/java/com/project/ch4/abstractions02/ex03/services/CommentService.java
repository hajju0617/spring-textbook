package com.project.ch4.abstractions02.ex03.services;

import com.project.ch4.abstractions02.ex03.model.Comment;
import com.project.ch4.abstractions02.ex03.proxies.CommentNotificationProxy;
import com.project.ch4.abstractions02.ex03.repositories.CommentRepository;

public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
