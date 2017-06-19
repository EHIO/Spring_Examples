package org.wg.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {
    @Pointcut("execution(public * org.wg.service..*.add(..))")
    public void myMethod() {
    }

    @Before("myMethod()")
    public void before() {
        System.out.println("method before");
    }

    @Around("myMethod()")
    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("method around start");
        pjp.proceed();
        System.out.println("method around end");
    }

    @After("myMethod()")
    public void after() {
        System.out.println("method after");
    }

}
