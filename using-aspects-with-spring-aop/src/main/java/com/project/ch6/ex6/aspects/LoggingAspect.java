package com.project.ch6.ex6.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    // 에스팩트를 @ToLog 에노테이션이 작성된 메서드에 적용함.
    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Logging Aspect: Calling the intercepted method");
        Object returnedValue = proceedingJoinPoint.proceed();
        logger.info("Logging Aspect: Method executed and returned " + returnedValue);
        return returnedValue;
    }
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
