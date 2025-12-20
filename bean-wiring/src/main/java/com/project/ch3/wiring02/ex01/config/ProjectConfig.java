package com.project.ch3.wiring02.ex01.config;

import com.project.ch3.wiring02.ex01.beans.Parrot;
import com.project.ch3.wiring02.ex01.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.project.ch3.wiring02.ex01.beans")
public class ProjectConfig {

}
