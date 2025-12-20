package com.project.ch3.wiring01.ex1.config;

import com.project.ch3.wiring01.ex1.beans.Parrot;
import com.project.ch3.wiring01.ex1.beans.Person;
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
    public Person person() {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot());     // Person의 Parrot 속성에 Parrot Bean의 참조를 설정.
        return person;
    }
}
