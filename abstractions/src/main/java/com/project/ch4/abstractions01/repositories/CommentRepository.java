package com.project.ch4.abstractions01.repositories;

import com.project.ch4.abstractions01.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
