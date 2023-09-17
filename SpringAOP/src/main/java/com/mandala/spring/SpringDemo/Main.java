package com.mandala.spring.SpringDemo;

import com.mandala.spring.SpringDemo.model.Circle;
import com.mandala.spring.SpringDemo.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");

        String[] names = context.getBeanDefinitionNames();
        for(String str: names){ System.out.println(str); }

        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);

        System.out.println("Circle's name: "+ shapeService.getCircle().getName() /*+ ",\nTriangle's name: " + shapeService.getTriangle() + " :" + shapeService.getTriangle().getName()*/);
    }
}