package com.project.ch4.abstractions02.ex02.proxies;

import com.project.ch4.abstractions02.ex02.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
