package com.mandala.spring.SpringDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {
    @Before("allGetters() && allCircleMethods()")
    public void loggingAdviceBefore(JoinPoint joinPoint){
        /*
        System.out.println(joinPoint);
        System.out.println(joinPoint.getKind());
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getTarget());
        System.out.println(joinPoint.getClass());
        System.out.println(joinPoint.getThis().toString());
        */
        System.out.println("Before Advice, Before method ran");
    }

    @Pointcut("execution(public * get*())")
    public void allGetters(){ }

//    @Before("args(String)")
    @Before("args(name)")
//    public void StringArgMethods(){
    public void StringArgMethods(String name){
        System.out.println("String arguments method is called! and the name is: " + name);
    }

    @Pointcut("within(com.mandala.spring.SpringDemo.model.Circle)")
    public void allCircleMethods(){}

}
