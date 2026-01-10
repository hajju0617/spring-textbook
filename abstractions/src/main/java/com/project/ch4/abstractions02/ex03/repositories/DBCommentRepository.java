package com.project.ch4.abstractions02.ex03.repositories;

import com.project.ch4.abstractions02.ex03.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
