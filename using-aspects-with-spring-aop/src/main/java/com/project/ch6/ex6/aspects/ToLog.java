package com.project.ch6.ex6.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)     // 런타임, 즉 실행 중에 AOP로 가로채기 위해서.
@Target(ElementType.METHOD)             // 메서드에만 사용되도록 제한.
public @interface ToLog {

}
