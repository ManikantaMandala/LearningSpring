package com.mandala.spring.SpringDemo;

public class Triangle {
    private String type;
    public void draw(){
        System.out.println(getType() + " Triangle is drawn");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
