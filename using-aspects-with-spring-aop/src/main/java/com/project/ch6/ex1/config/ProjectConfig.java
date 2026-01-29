package com.project.ch6.ex1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =
        "com.project.ch6.ex1.service"
)
public class ProjectConfig {
}
