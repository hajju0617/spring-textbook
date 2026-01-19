package com.project.ch5.ex7;

import com.project.ch5.ex7.config.ProjectConfig;
import com.project.ch5.ex7.model.Comment;
import com.project.ch5.ex7.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        commentService.sendComment(new Comment());
        commentService.sendComment(new Comment());
    }
}
