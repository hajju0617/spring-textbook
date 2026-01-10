package com.project.ch4.abstractions03.configuration;

import com.project.ch4.abstractions03.proxies.CommentNotificationProxy;
import com.project.ch4.abstractions03.proxies.EmailCommentNotificationProxy;
import com.project.ch4.abstractions03.repositories.CommentRepository;
import com.project.ch4.abstractions03.repositories.DBCommentRepository;
import com.project.ch4.abstractions03.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"com.project.ch4.abstractions03.proxies",
                        "com.project.ch4.abstractions03.services",
                        "com.project.ch4.abstractions03.repositories"}
)
public class ProjectConfiguration {

}
