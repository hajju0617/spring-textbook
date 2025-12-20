package com.project.ch2.definition01;

import com.project.ch2.definition01.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // ↓ 스프링 컨텍스트의 인스턴스를 생성. (구성 클래스를 매개변수로 전송하여 스프링이 이를 사용하도록 지시.)
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Parrot parrot = context.getBean(Parrot.class);      // 스프링 컨텍스트에서 Parrot 타입의 빈 참조를 가져옴.
        /*
            ↑ NoUniqueBeanDefinitionException 발생 --> 3개의 Parrot 중 어떤 것을 참조하는지 추정할 수 없기 때문.
            No qualifying bean of type 'com.project.ch2.definition_03.Parrot' available: expected single matching bean but found 3: parrot1,parrot2,parrot3
        */

        Parrot parrot2 = context.getBean("parrot2", Parrot.class);   // Bean 이름을 명시적으로 지정해줌으로써 모호성 문제를 해결.
        System.out.println("parrot.getName() = " + parrot2.getName());

        Parrot parrot3 = context.getBean("riki", Parrot.class);   // Bean 이름을 명시적으로 지정해줌으로써 모호성 문제를 해결.
        System.out.println("parrot.getName() = " + parrot3.getName());

        Parrot parrotPrimary = context.getBean(Parrot.class);           // @Primary 에노테이션으로 기본값 설정한 케이스.
        System.out.println("parrotPrimary.getName() = " + parrotPrimary.getName());

        String string = context.getBean(String.class);
        System.out.println("string = " + string);

        Integer integer = context.getBean(Integer.class);
        System.out.println("integer = " + integer);


    }
}