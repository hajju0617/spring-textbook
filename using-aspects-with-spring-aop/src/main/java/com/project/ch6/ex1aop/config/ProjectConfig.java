package com.project.ch6.ex1aop.config;

import com.project.ch6.ex1aop.aspect.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages =
        "com.project.ch6.ex1aop.service"
)
@EnableAspectJAutoProxy         // 에스팩트 메커니즘 활성화.
public class ProjectConfig {
    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
