package com.example.App.models;

public class Square extends Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (double)(side * side);
    }
}
