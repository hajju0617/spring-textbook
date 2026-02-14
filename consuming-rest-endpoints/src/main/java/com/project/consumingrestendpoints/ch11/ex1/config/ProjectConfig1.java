package com.project.consumingrestendpoints.ch11.ex1.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.project.consumingrestendpoints.ch11.ex1.proxy")
public class ProjectConfig1 {
}
