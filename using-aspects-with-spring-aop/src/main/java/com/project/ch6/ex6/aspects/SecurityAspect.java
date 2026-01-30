package com.project.ch6.ex6.aspects;

import com.project.ch6.ex6.service.CommentService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class SecurityAspect {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Security Aspect: Calling the intercepted method");
        Object returnedValue = proceedingJoinPoint.proceed();
        logger.info("Security Aspect: Method executed and returned " + returnedValue);
        return returnedValue;
    }
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
