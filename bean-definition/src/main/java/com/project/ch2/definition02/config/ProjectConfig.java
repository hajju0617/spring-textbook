package com.project.ch2.definition02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration  // 해당 클래스를 '스프링 구성 클래스'로 정의.
@ComponentScan(basePackages = "com.project.ch2.definition02")      // stereotype 에노테이션으로 지정된 클래스의 경로를 지정.
public class ProjectConfig {

}
