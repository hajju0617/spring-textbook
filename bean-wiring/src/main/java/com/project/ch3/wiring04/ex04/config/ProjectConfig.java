package com.project.ch3.wiring04.ex04.config;

import com.project.ch3.wiring04.ex04.beans.Parrot;
import com.project.ch3.wiring04.ex04.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    @Primary        // 기본 빈(Bean) 설정.
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Person person(Parrot parrot2) {      // 매개변수 이름(parrot2)이 Miki 앵무새의 빈 이름(parrot2)과 일치함.
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot2);
        return p;
    }
}
