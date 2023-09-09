package com.mandala.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        because it is an abstract
//        Triangle parentTriangle = (Triangle) context.getBean("parentTriangle");
        Triangle childTriangle = (Triangle) context.getBean("childTriangle");

//        System.out.println(parentTriangle);
        System.out.println(childTriangle);
        childTriangle.draw();
    }
}
