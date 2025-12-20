package com.project.ch2.definition02;

import com.project.ch2.definition02.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // ↓ 스프링 컨텍스트의 인스턴스를 생성. (구성 클래스를 매개변수로 전송하여 스프링이 이를 사용하도록 지시.)
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println("parrot = " + parrot);
        System.out.println("parrot.getName() = " + parrot.getName());

        Parrot2 parrot2 = context.getBean(Parrot2.class);
        System.out.println("parrot2.getName() = " + parrot2.getName());     // @PostConstruct 에노테이션으로 인해 name이 null이 아니라 Kiki가 출력됨.
    }
}