package com.project.ch4.abstractions01.proxies;

import com.project.ch4.abstractions01.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
