package com.project.ch4.abstractions04.configuration;

import com.project.ch4.abstractions04.proxies.CommentNotificationProxy;
import com.project.ch4.abstractions04.proxies.EmailCommentNotificationProxy;
import com.project.ch4.abstractions04.repositories.CommentRepository;
import com.project.ch4.abstractions04.repositories.DBCommentRepository;
import com.project.ch4.abstractions04.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {
        @Bean
        public CommentRepository commentRepository() {
                return new DBCommentRepository();
        }

        @Bean
        public CommentNotificationProxy commentNotificationProxy() {
                return new EmailCommentNotificationProxy();
        }

        @Bean
        public CommentService commentService(CommentRepository commentRepository,
                                             CommentNotificationProxy commentNotificationProxy) {
                return new CommentService(commentRepository, commentNotificationProxy);
        }
}
