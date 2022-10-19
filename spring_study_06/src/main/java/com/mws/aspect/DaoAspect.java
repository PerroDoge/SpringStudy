package com.mws.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DaoAspect {
   // @Before("execution(* com.mws.dao.impl.*.add*(..))")
    public void methodBefore() {
        System.out.println("------------");
        System.out.println("methodBefore invoked");
        System.out.println("------------");
    }
   // @After("execution(* com.mws.dao.impl.*.*(..))")
    public void methodAfter() {
        System.out.println("***********");
        System.out.println("methodAfter invoked");
        System.out.println("***********");
    }
    @Around("execution(* com.mws.dao.*.*(..))")
    public Object methodAround(ProceedingJoinPoint joinPoint) {
        System.out.println("AROUND!!!!!!");
        Object res = null;
        try {
            res = joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("AROUND!!!!!");
        return 2;
    }
}
