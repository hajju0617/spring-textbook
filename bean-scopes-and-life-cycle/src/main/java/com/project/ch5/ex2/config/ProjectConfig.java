package com.project.ch5.ex2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.project.ch5.ex2.repository",
        "com.project.ch5.ex2.service"
})
public class ProjectConfig {
}
