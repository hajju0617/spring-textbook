package com.project.ch3.wiring01.ex2.config;

import com.project.ch3.wiring01.ex2.beans.Parrot;
import com.project.ch3.wiring01.ex2.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    // 빈(Bean) 정의.
    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    // 빈(Bean) 정의.
    @Bean
    public Person person(Parrot parrot) {       // 스프링이 이 메서드의 매개변수에 Parrot 빈을 주입함.
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot);
        return person;
    }
}
