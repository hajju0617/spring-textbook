package com.project.ch4.abstractions02.ex03.repositories;

import com.project.ch4.abstractions02.ex03.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
