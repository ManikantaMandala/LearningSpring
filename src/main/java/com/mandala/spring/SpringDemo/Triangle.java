package com.mandala.spring.SpringDemo;

public class Triangle implements Shape{
    private Point origin, pointB, pointC;
    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
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
        System.out.println("Point A : x = " + getOrigin().getX() + " y = " + getOrigin().getY());
        System.out.println("Point B : x = " + getPointB().getX() + " y = " + getPointB().getY());
        System.out.println("Point C : x = " + getPointC().getX() + " y = " + getPointC().getY());
    }

}
