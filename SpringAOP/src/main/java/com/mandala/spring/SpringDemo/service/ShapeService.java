package com.mandala.spring.SpringDemo.service;

import com.mandala.spring.SpringDemo.aspect.Loggable;
import com.mandala.spring.SpringDemo.model.Circle;
import com.mandala.spring.SpringDemo.model.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeService {
    @Autowired
    private Circle circle;
    @Autowired
    private Triangle triangle;

    @Loggable
    public Circle getCircle() {
        System.out.println("getting the circle object");
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    @Loggable
    public Triangle getTriangle() {
        System.out.println("getting the triangle object");
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
