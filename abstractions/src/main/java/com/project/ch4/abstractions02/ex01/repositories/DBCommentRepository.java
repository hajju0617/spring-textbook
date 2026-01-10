package com.project.ch4.abstractions02.ex01.repositories;

import com.project.ch4.abstractions02.ex01.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
