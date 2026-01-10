package com.project.ch4.abstractions04.repositories;

import com.project.ch4.abstractions04.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
