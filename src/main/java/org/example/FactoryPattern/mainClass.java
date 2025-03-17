package org.example.FactoryPattern;

public class mainClass {
    public static void main(String args[]){
        ShapeFactory shapeFactoryObj=new ShapeFactory();
        Shape shapeObj=shapeFactoryObj.getShape("CIRCLE");
        shapeObj.draw();
    }
}
