package com.project.ch5.ex2;

import com.project.ch5.ex2.config.ProjectConfig;
import com.project.ch5.ex2.service.CommentService;
import com.project.ch5.ex2.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var bean1 = context.getBean(CommentService.class);
        var bean2 = context.getBean(UserService.class);
        System.out.println("bean1.getCommentRepository() == bean2.getCommentRepository() ? " + (bean1.getCommentRepository() == bean2.getCommentRepository()));
    }
}
