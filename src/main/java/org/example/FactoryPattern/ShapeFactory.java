package org.example.FactoryPattern;

public class ShapeFactory {
    Shape getShape(String input){
        switch (input){
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            default:
                return null;
        }
    }
}
