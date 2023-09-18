package com.mandala.spring.SpringDemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("pointCut() && allCircleMethodsWay2()")
    public void loggingAdviceBefore(){
        System.out.println("Before Advice, Before method ran");
    }

    @Pointcut("execution(public * get*())")
    public void pointCut(){ }

    // way - 1 -> (using execution) - for point cutting for only the methods in Circle class
    @Pointcut("execution(* com.mandala.spring.SpringDemo.model.Circle.*(..))")
    public void allCircleMethodsWay1(){}

    // way - 2 -> using within()
    @Pointcut("within(com.mandala.spring.SpringDemo.model.Circle)")
    public void allCircleMethodsWay2(){}

}
