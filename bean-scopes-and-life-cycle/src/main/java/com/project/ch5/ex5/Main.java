package com.project.ch5.ex5;

import com.project.ch5.ex5.config.ProjectConfig;
import com.project.ch5.ex5.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = context.getBean("commentService", CommentService.class);
        var cs2 = context.getBean("commentService", CommentService.class);
        // Prototype 이므로 빈을 요청할 때마다 새로운 인스턴스를 반환받음. 즉, 객체의 주소값이 다름.
        System.out.println("cs1 == cs2 ? " + (cs1 == cs2));
    }
}
