package com.mandala.spring.SpringDemo.model;

public class Circle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String setNameAndReturn(String name) {
        return this.name = name;
    }
}
