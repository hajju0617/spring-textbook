package com.project.ch2.definition_03;

import com.project.ch2.definition_02.Parrot2;
import com.project.ch2.definition_03.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // ↓ 스프링 컨텍스트의 인스턴스를 생성. (구성 클래스를 매개변수로 전송하여 스프링이 이를 사용하도록 지시.)
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;      // 해당 인스턴스를 반환할 Supplier를 선언.

        // context.registerBean("parrot1", Parrot.class, parrotSupplier);

        context.registerBean("parrot1",       // registerBean 메서드를 호출해서 이 인스턴스를 스프링 컨텍스트에 추가.
                Parrot.class,
                parrotSupplier,
                bc -> bc.setPrimary(true));

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());
    }
}