package com.mandala.spring.SpringDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();

        String[] beans = context.getBeanDefinitionNames();
        System.out.println("Beans...");
        for(String bean: beans){
            System.out.println(bean);
        }

        System.out.println();

        Shape shape = (Shape) context.getBean("circle");
        shape.draw();
    }
}
