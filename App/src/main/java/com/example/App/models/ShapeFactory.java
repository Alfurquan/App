package com.example.App.models;

public class ShapeFactory {
    public static Shape getShape(ShapeInput shapeInput){
        Shape shape = null;
        switch (shapeInput.getType()){
            case "circle": shape = new Circle(shapeInput.getRadius());
                           break;
            case "square" : shape = new Square(shapeInput.getSide());
                            break;
            case "rectangle" : shape = new Rectangle(shapeInput.getLength(),shapeInput.getBreadth());
                               break;
        }
        return shape;
    }
}
