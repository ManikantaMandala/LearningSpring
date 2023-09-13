package com.mandala.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        String[] beans = context.getBeanDefinitionNames();
        for(String bean: beans){
            System.out.println(bean);
        }
        Shape shape = (Shape) context.getBean("circle");
        shape.draw();
    }
}
