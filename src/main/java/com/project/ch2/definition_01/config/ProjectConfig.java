package com.project.ch2.definition_01.config;

import com.project.ch2.definition_01.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration  // 해당 클래스를 '스프링 구성 클래스'로 정의.
public class ProjectConfig {

    @Bean   // 스프링 컨텍스트가 초기화될 때 이 메서드를 호출하고 반환된 값을 컨텍스트에 추가하라는 지시.
    Parrot parrot() {
        var parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;  // 메서드가 반환한 'Parrot 인스턴스'를 스프링 컨텍스트에 추가.
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
