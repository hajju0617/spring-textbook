package com.project.ch4.abstractions02.ex03.proxies;

import com.project.ch4.abstractions02.ex03.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
