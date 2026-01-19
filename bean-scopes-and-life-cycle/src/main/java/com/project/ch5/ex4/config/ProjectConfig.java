package com.project.ch5.ex4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.project.ch5.ex4.service"
})
public class ProjectConfig {
}
