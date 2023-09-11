package com.mandala.spring.SpringDemo;

public class Circle implements Shape{
    private Point origin;

    @Override
    public void draw() {
        System.out.println("Circle's center: (" + getOrigin().getX() + "," + getOrigin().getY() + ")");
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }
}
