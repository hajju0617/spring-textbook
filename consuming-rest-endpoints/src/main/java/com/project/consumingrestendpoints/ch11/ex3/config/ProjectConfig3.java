package com.project.consumingrestendpoints.ch11.ex3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ProjectConfig3 {
    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }
}
