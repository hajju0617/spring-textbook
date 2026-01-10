package com.project.ch4.abstractions02.ex03.proxies;

import com.project.ch4.abstractions02.ex03.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
