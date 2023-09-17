package com.mandala.spring.SpringDemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{

    @Autowired
    @Qualifier("origin")
    private Point origin;

    @Override
    public void draw() {
        System.out.println("Circle's center: (" + getOrigin().getX() + "," + getOrigin().getY() + ")");
    }

    public Point getOrigin() {
        return origin;
    }

    @Resource
    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    @PostConstruct
    public void initCircle(){
        System.out.println("initializing a circle bean");
    }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destroying a circle bean");
    }
}
