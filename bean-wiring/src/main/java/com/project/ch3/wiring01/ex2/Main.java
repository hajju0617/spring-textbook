package com.project.ch3.wiring01.ex2;

import com.project.ch3.wiring01.ex2.beans.Parrot;
import com.project.ch3.wiring01.ex2.beans.Person;
import com.project.ch3.wiring01.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 구성 클래스(ProjectConfig)를 기반으로 스프링 컨텍스트 인스턴스 생성.
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // 스프링 컨텍스트에서 빈의 참조를 얻음.
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person's name: " + person.getName());
        System.out.println("Parrot's name: " + parrot.getName());
        System.out.println("Person's parrot: " + person.getParrot());
    }
}
