package com.project.ch4.abstractions02.ex01.repositories;

import com.project.ch4.abstractions02.ex01.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
