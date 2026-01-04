package com.project.ch4.abstractions03.services;

import com.project.ch4.abstractions03.model.Comment;
import com.project.ch4.abstractions03.proxies.CommentNotificationProxy;
import com.project.ch4.abstractions03.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
