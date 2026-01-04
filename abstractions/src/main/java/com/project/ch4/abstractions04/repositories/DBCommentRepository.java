package com.project.ch4.abstractions04.repositories;

import com.project.ch4.abstractions04.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
