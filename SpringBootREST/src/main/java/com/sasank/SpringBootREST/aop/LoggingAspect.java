package com.sasank.SpringBootREST.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);

    // return type, class-name.method-name (args)

    @Before("execution(* com.sasank.SpringBootREST.service.JobService.*(..))")
    public  void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called " + jp.getSignature().getName() );
    }

    @After("execution(* com.sasank.SpringBootREST.service.JobService.*(..))")
    public  void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method executed " + jp.getSignature().getName() );
    }

    @AfterThrowing("execution(* com.sasank.SpringBootREST.service.JobService.*(..))")
    public  void logMethodCrash(JoinPoint jp){
        LOGGER.info("Method has some issues " + jp.getSignature().getName() );
    }
    @AfterReturning("execution(* com.sasank.SpringBootREST.service.JobService.*(..))")
    public  void logMethodSuccess(JoinPoint jp){
        LOGGER.info("Method has returned succesfully " + jp.getSignature().getName() );
    }

}
