package com.mandala.spring.SpringDemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("pointCut()")
    public void loggingAdviceBefore(){
        System.out.println("Before Advice, Before method ran");
    }

    @After("pointCut()")
    public void loggingAdviceAfter() { System.out.println("After Advice, After method ran");}

    @Pointcut("execution(public * get*())")
    public void pointCut(){

    }

}
