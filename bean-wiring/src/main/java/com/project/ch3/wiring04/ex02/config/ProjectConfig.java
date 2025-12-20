package com.project.ch3.wiring04.ex02.config;

import com.project.ch3.wiring04.ex02.beans.Parrot;
import com.project.ch3.wiring04.ex02.beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Person person(@Qualifier("parrot2") Parrot parrot2) {      // @Qualifier 사용하여 컨텍스트에서 특정 빈을 삽입하려는 의도를 명확히 표시.
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot2);
        return p;
    }
}
