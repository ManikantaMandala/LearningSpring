package com.mandala.spring.SpringDemo;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
    private Point origin;

    @Override
    public void draw() {
        System.out.println("Circle's center: (" + getOrigin().getX() + "," + getOrigin().getY() + ")");
    }

    public Point getOrigin() {
        return origin;
    }

//    @Resource

    @Autowired // TODO: Understand why it's not working
    @Qualifier("originPoint")
    public void setOrigin(Point origin) {
        this.origin = origin;
    }
}
