package com.project.ch5.ex6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.project.ch5.ex6.repository",
        "com.project.ch5.ex6.services"
})
public class ProjectConfig {
}
