package com.mandala.spring.SpringDemo;

import java.util.List;
import java.util.function.Consumer;

public class Triangle {
    List<Point> points;
    public void draw(){
        points.forEach((p)-> System.out.println("Point = (" + p.getX() + "," + p.getY() + ")"));
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
