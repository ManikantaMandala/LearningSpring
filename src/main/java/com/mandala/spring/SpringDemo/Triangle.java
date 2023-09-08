package com.mandala.spring.SpringDemo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Triangle implements ApplicationContextAware {
    private Point pointA, pointB, pointC;
    ApplicationContext context = null;

    public void setPointA(Point pointA) {
        this.pointA = pointA;
//        System.out.println(this.context.getBean("pointA") + " hello ");
        System.out.println(this.pointA + " A");
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
//        this.pointB = (Point) context.getBean("pointB");
        this.pointB = pointB;
        System.out.println(this.pointB + " B");
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
//        this.pointC = (Point) context.getBean("pointC");
        this.pointC = pointC;
        System.out.println(this.pointC+" C");
    }

    public void draw(){
        System.out.println("Point A " + this.pointA + ": x = " + getPointA().getX() + " y = " + getPointA().getY());
        System.out.println("Point B " + this.pointB + ": x = " + getPointB().getX() + " y = " + getPointB().getY());
        System.out.println("Point C " + this.pointC + ": x = " + getPointC().getX() + " y = " + getPointC().getY());
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
        System.out.println(this.context);
        this.pointA = (Point) this.context.getBean("pointA");
        this.pointB = (Point) this.context.getBean("pointB");
        this.pointC = (Point) this.context.getBean("pointC");
    }
}
