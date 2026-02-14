package com.project.consumingrestendpoints.ch11.ex2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProjectConfig2 {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
