package com.mandala.spring.SpringDemo.service;

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

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
