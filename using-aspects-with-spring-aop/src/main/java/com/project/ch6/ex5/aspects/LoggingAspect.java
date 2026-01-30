package com.project.ch6.ex5.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    // 에스팩트를 @ToLog 에노테이션이 작성된 메서드에 적용함.
    @AfterReturning(value = "@annotation(ToLog)", returning = "returnedValue")      // 가로챈 메서드의 반환값: returnedValue
    public void log(Object returnedValue) {     // returning 속성과 매개변수명이 같아야됨.
        logger.info("Method executed and returned " + returnedValue);
    }
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
