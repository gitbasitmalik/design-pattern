
package com.mycompany.factorymethod;

import java.util.ArrayList;

public class singleFactoryMethod {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        
        shapes.add(ShapeFactory.createShape("circle"));
        shapes.add(ShapeFactory.createShape("square"));
        shapes.add(ShapeFactory.createShape("triangle"));
        
        for (Shape s : shapes) {
            s.draw();
        }
    }
}

class ShapeFactory {
    public static Shape createShape(String type) {
        switch (type.toLowerCase()) {
            case "circle" -> {
                return new Circle();
            }
            case "square" -> {
                return new Square();
            }
            case "triangle" -> { 
                return new Triangle();
            }
            default -> throw new IllegalArgumentException("Invalid shape type: " + type);
        }
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn ⭕");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square is drawn ⏹️");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle is drawn △");
    }
}
