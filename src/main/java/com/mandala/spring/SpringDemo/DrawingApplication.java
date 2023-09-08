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
        Triangle triangle1 = (Triangle) applicationContext.getBean("triangle");
        Triangle triangle2 = (Triangle)  applicationContext.getBean("triangle");

/*
        Both the objects reference point to same reference(same object)
        This is because of Singleton bean scope
        Singleton bean scope: only once per spring container
*/
/*
        Both the objects reference point to different reference(different objects)
        This is because of Prototype bean scope
        Prototype bean scope: new bean created with every request or reference
*/

        System.out.println(triangle1);
        System.out.println(triangle2);
        triangle1.draw();
        triangle2.draw();
    }
}
