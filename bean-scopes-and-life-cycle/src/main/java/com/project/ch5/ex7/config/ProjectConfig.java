package com.project.ch5.ex7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.project.ch5.ex7.processors",
        "com.project.ch5.ex7.services",
        "com.project.ch5.ex7.repository"
})
public class ProjectConfig {
}
