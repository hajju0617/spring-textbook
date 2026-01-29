package com.project.ch6.ex3.aspect;

import com.project.ch6.ex3.model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("execution(* com.project.ch6.ex3.service.*.*(..))")      // 메서드 가로챔.
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // throws Throwable: proceed() 메서드는 가로챈 메서드에서 발생하는 모드 예외를 던지도록 설계되었음.

        // 가로챈 메서드의 이름을 가져옴.
        String methodName = proceedingJoinPoint.getSignature().getName();
        // 가로챈 메서드의 매개변수를 가져옴.
        Object[] arguments = proceedingJoinPoint.getArgs();

        logger.info("Method: " + methodName + " with parameters: " + Arrays.asList(arguments) + " will execute");
        Comment comment = new Comment();
        comment.setText("Some other text!");
        Object[] newArguments = {comment};


        // 가로챌 메서드 호출. (다른 댓글 객체를 메서드 매개변수의 값으로 전달함.)
        Object returnByMethod = proceedingJoinPoint.proceed(newArguments);
        logger.info("Method executed and returned: " + returnByMethod);
        // ↑ 가로챈 메서드의 반환값을 로깅. ↓ 호출자에게는 다른 값을 반환.
        return "FAILED";
    }
}
