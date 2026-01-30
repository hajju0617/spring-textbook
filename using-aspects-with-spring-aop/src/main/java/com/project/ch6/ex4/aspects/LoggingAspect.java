package com.project.ch6.ex4.aspects;

import com.project.ch6.ex4.model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("@annotation(ToLog)")      // 에스팩트를 @ToLog 에노테이션이 작성된 메서드에 적용함.
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // throws Throwable: proceed() 메서드는 가로챈 메서드에서 발생하는 모드 예외를 던지도록 설계되었음.

        // 가로챈 메서드의 이름을 가져옴.
        String methodName = proceedingJoinPoint.getSignature().getName();
        // 가로챈 메서드의 매개변수를 가져옴.
        Object[] arguments = proceedingJoinPoint.getArgs();

        logger.info("Method: " + methodName + " with parameters: " + Arrays.asList(arguments) + " will execute");

        Object returnByMethod = proceedingJoinPoint.proceed();

        // 가로챈 메서드의 반환값을 로깅.
        logger.info("Method executed and returned: " + returnByMethod);
        return "returnByMethod";
    }
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
