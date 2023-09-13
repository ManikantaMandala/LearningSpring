package com.mandala.spring.SpringDemo;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Circle implements Shape{

    @Autowired
    @Qualifier("pointA")
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
