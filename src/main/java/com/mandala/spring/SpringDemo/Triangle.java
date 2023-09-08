package com.mandala.spring.SpringDemo;

import java.util.List;
import java.util.function.Consumer;

public class Triangle {
    Point pointA, pointB, pointC;
    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println("Point A: x = " + getPointA().getX() + " y = " + getPointA().getY());
        System.out.println("Point B: x = " + getPointB().getX() + " y = " + getPointB().getY());
        System.out.println("Point C: x = " + getPointC().getX() + " y = " + getPointC().getY());
    }

}
