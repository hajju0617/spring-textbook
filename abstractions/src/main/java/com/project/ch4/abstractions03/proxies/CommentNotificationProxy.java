package com.project.ch4.abstractions03.proxies;

import com.project.ch4.abstractions03.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
