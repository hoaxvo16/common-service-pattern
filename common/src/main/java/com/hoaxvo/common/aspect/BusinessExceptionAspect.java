package com.hoaxvo.common.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class BusinessExceptionAspect {

    @AfterThrowing(throwing = "com.hoaxvo.common.exception.BusinessRuntimeException")
    public void handle(JoinPoint joinPoint, Exception exception) {
        log.info("Exception has been throw type {} message {}", exception.getClass().getName(), exception.getMessage());
    }
}
