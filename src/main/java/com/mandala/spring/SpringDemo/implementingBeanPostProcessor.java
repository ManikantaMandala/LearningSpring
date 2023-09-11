package com.mandala.spring.SpringDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class implementingBeanPostProcessor implements BeanPostProcessor {
    //These method are executed for each and every object initialized
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //Before initialization of an object this method executes
        System.out.println("Before initialization of " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //After initialization of an object this method executes
        System.out.println("After initialization of " + beanName);
        return bean;
    }
}
