package com.project.ch4.abstractions02.ex02.repositories;

import com.project.ch4.abstractions02.ex02.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
