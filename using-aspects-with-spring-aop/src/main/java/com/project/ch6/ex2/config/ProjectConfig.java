package com.project.ch6.ex2.config;

import com.project.ch6.ex2.aspect.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages =
        "com.project.ch6.ex2.service"
)
@EnableAspectJAutoProxy         // 에스팩트 메커니즘 활성화.
public class ProjectConfig {
    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
