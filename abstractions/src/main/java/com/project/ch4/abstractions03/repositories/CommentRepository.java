package com.project.ch4.abstractions03.repositories;

import com.project.ch4.abstractions03.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
