package com.example.App.models;

public abstract class Shape {
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract double calculateArea();
}
