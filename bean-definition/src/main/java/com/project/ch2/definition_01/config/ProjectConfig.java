package com.project.ch2.definition_01.config;

import com.project.ch2.definition_01.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration  // 해당 클래스를 '스프링 구성 클래스'로 정의.
public class ProjectConfig {

    @Bean   // 스프링 컨텍스트가 초기화될 때 이 메서드를 호출하고 반환된 값을 컨텍스트에 추가하라는 지시.
    @Primary
    Parrot parrot1() {
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

    // @Bean 에노테이션을 통해 동일한 타입의 인스턴스를 원하는 만큼 선언할 수 있음.
    @Bean
    Parrot parrot2() {
        var parrot = new Parrot();
        parrot.setName("Miki");
        return parrot;
    }
    @Bean(name = "riki")    // 에노테이션의 name or value 속성을 이용해서 빈의 이름을 'parrot3'가 아니라 'riki'로 지정할 수 있음.
    Parrot parrot3() {
        var parrot = new Parrot();
        parrot.setName("Riki");
        return parrot;
    }
}
