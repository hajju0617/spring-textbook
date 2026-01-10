package com.project.ch4.abstractions04.proxies;

import com.project.ch4.abstractions04.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
