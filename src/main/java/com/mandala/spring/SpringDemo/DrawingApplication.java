package com.mandala.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
    public static void main(String[] args) {
//        Using new operator
//        com.mandala.spring.SpringDemo.Triangle triangle = new com.mandala.spring.SpringDemo.Triangle();

//        Using spring container
//        Using ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) applicationContext.getBean("triangle");
        Triangle triangle1 = (Triangle) applicationContext.getBean("tri");
        triangle.draw();
        triangle1.draw();
    }
}
