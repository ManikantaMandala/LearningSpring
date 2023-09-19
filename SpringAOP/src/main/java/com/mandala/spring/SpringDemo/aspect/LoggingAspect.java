package com.mandala.spring.SpringDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

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
    @AfterReturning(pointcut = "args(name)", returning = "strReturn")
//    public void StringArgMethods(){
    public void StringArgMethods(String name, String strReturn){
        System.out.println("String arguments method is called! and the name is: " + name);
        System.out.println(strReturn);
    }

    @AfterThrowing(pointcut = "args(name)", throwing = "throwingException")
    public void exceptionAdvice(String name, RuntimeException throwingException){
        System.out.println("An exception has been thrown " + name);
        System.out.println(throwingException);
    }

    @Around("allGetters()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        Object returnObject = null;
        try {
            System.out.println("Before advice");
            returnObject = proceedingJoinPoint.proceed();
            System.out.println("After Returning");
        }
        catch (Throwable e) {
            System.out.println("After throwing");
        }
        System.out.println("After finally");
        return returnObject;
    }

    @Pointcut("within(com.mandala.spring.SpringDemo.model.Circle)")
    public void allCircleMethods(){}

}
