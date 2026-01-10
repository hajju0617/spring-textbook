package com.project.ch4.abstractions02.ex01.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"com.project.ch4.abstractions02.ex01.proxies",
                "com.project.ch4.abstractions02.ex01.repositories",
                "com.project.ch4.abstractions02.ex01.services"
        }
)
public class ProjectConfiguration {
}
