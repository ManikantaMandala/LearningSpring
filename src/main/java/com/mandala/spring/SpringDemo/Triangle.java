package com.mandala.spring.SpringDemo;


import java.util.List;


public class Triangle {
    private Point pointA, pointB, pointC;
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

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
        System.out.println("Point A " + this.pointA + ": x = " + getPointA().getX() + " y = " + getPointA().getY());
        System.out.println("Point B " + this.pointB + ": x = " + getPointB().getX() + " y = " + getPointB().getY());
        System.out.println("Point C " + this.pointC + ": x = " + getPointC().getX() + " y = " + getPointC().getY());
        System.out.println("Elements in the list");
        points.forEach(System.out::println);
    }

}
