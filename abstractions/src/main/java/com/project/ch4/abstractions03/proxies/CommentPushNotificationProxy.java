package com.project.ch4.abstractions03.proxies;

import com.project.ch4.abstractions03.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary    // @Primary 가 없다면 NoUniqueBeanDefinitionException 이 발생. (DI에 대한 기본 구현값으로 설정.)
public class CommentPushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
