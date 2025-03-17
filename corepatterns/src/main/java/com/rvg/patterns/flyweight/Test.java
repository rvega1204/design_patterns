package com.rvg.patterns.flyweight;

/*
 * PaintApp class is a client class that uses the ShapeFactory class to get the shape objects
 * It has a render method that takes the number of shapes to be drawn as input
 * It then uses the ShapeFactory class to get the shape objects and calls the draw method on them
 * The draw method is overloaded in the Shape class and the concrete implementations of the draw method are provided in the Circle and Rectangle classes
 * The ShapeFactory class is used to get the shape objects and store them in a map to avoid creating duplicate objects
 */
public class Test {

    public static void main(String[] args) {
        PaintApp app = new PaintApp();
        app.render(10);
    }
}
