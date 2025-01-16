package com.sasank.SpringBootREST.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfomanceMonitorAspect {

    private static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);

    @Around("execution(* com.sasank.SpringBootREST.service.JobService.*(..))")
    public Object montiorTime(ProceedingJoinPoint jp) throws Throwable {
        long start= System.currentTimeMillis();
        Object ob= jp.proceed();
        long end= System.currentTimeMillis();
        LOGGER.info("Time taken is " + jp.getSignature().getName() + " " +(end-start) +" milli seconds");
        return ob;
    }


}
