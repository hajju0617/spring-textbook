package com.project.ch5.ex6;

import com.project.ch5.ex6.config.ProjectConfig;
import com.project.ch5.ex6.services.CommentService;
import com.project.ch5.ex6.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var cs1 = context.getBean(CommentService.class);
        var us1 = context.getBean(UserService.class);
        // CommentRepository: 프로토타입 빈.
        System.out.println("cs1.getCommentRepository() == us1.getCommentRepository() ? " + (cs1.getCommentRepository() == us1.getCommentRepository()));
    }
}
