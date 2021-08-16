package com.example.App.models;

public class Circle implements Shape{
    private int radius;
    private final double PI = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * (radius) * radius;
    }
}
