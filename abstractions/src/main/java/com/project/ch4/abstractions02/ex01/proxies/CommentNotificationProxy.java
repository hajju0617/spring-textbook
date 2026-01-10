package com.project.ch4.abstractions02.ex01.proxies;

import com.project.ch4.abstractions02.ex01.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
