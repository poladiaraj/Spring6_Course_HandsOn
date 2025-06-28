package com.rpoladia.springbootrest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return-type FQCN.method_name(args)
    @Before("execution(* com.rpoladia.springbootrest.service.JobService.*(..))")
    public void logBeforeMethodCall() {
        LOGGER.info("Method called");
    }

    @Before("execution(* com.rpoladia.springbootrest.service.JobService.getAllJobs(..)) || execution(* com.rpoladia.springbootrest.service.JobService.getJob(..))")
    public void logBeforeSpecificMethodCall(JoinPoint jp) {
        LOGGER.info("Method called: " + jp.getSignature().getName());
    }

    @After("execution(* com.rpoladia.springbootrest.service.JobService.getAllJobs(..))")
    public void logAfterSpecificMethodCall(JoinPoint jp) {
        LOGGER.info("Method executed: " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.rpoladia.springbootrest.service.JobService.getJob(..))")
    public void logAfterThrowingSpecificMethodCall(JoinPoint jp) {
        LOGGER.info("Method has some issues: " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.rpoladia.springbootrest.service.JobService.getAllJobs(..))")
    public void logAfterReturningSpecificMethodCall(JoinPoint jp) {
        LOGGER.info("Method returned: " + jp.getSignature().getName());
    }
}
