package com.project.ch4.abstractions04.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"com.project.ch4.abstractions04.proxies",
                        "com.project.ch4.abstractions04.services",
                        "com.project.ch4.abstractions04.repositories"}
)
public class ProjectConfiguration {

}
