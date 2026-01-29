package com.project.ch6.ex1aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("execution(* com.project.ch6.ex1aop.service.*.*(..))")      // 메서드 가로챔.
    public void log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // throws Throwable: proceed() 메서드는 가로챈 메서드에서 발생하는 모드 예외를 던지도록 설계되었음.

        logger.info("Method will execute");
        proceedingJoinPoint.proceed();      // 가로챌 메서드 호출.
        logger.info("Method executed");
    }
}
