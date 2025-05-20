package com.github.yescco2d71828.aop.b_aspectj.component;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    @Before("execution(public * com.github.yescco2d71828.aop.b_aspectj.service.FinanceService.*(..))")
    public void beforePrint() {
        System.out.println("Logger beforePrint run ......");
    }

    @After("@annotation(com.github.yescco2d71828.aop.b_aspectj.component.Log)")
    public void afterPrint() {
        System.out.println("Logger afterPrint run ......");
    }

    @AfterReturning("execution(* com.github.yescco2d71828.aop.b_aspectj.service.*.*(String))")
    public void afterReturningPrint() {
        System.out.println("Logger afterReturningPrint run ......");
    }

    @AfterThrowing("defaultPointcut()")
    public void afterThrowingPrint() {
        System.out.println("Logger afterThrowingPrint run ......");
    }

    @Around("execution(public * com.github.yescco2d71828.aop.b_aspectj.service.FinanceService.addMoney(..))")
    public Object aroundPrint(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Logger aroundPrint before run ......");
        try {
            Object retVal = joinPoint.proceed();
            System.out.println("Logger aroundPrint afterReturning run ......");
            return retVal;
        } catch (Throwable e) {
            System.out.println("Logger aroundPrint afterThrowing run ......");
            throw e;
        } finally {
            System.out.println("Logger aroundPrint after run ......");
        }
    }

    @Pointcut("execution(* com.github.yescco2d71828.aop.b_aspectj.service.*.*(String))")
    public void defaultPointcut() {

    }
}
