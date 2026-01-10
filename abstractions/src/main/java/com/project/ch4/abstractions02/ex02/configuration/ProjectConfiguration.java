package com.project.ch4.abstractions02.ex02.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"com.project.ch4.abstractions02.ex02.proxies",
                "com.project.ch4.abstractions02.ex02.repositories",
                "com.project.ch4.abstractions02.ex02.services"
        }
)
public class ProjectConfiguration {
}
