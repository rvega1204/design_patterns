package com.rvg.patterns.flyweight;

/*
 * PaintApp class is the client class which uses the ShapeFactory to get the shape objects
 * It has a render method which takes the number of shapes to be drawn as input
 * It then uses the ShapeFactory to get the shape objects and calls the draw method on them
 * The draw method is overloaded in the Shape class and the concrete implementations of the draw method are provided in the Circle and Rectangle classes
 * The ShapeFactory class is used to get the shape objects and store them in a map to avoid creating duplicate objects
 */
public class PaintApp {

    /**
     * The render method takes the number of shapes to be drawn as input.
     * It uses the ShapeFactory to get the shape objects and calls the draw method
     * on them.
     * The draw method is overloaded in the Shape class, with concrete
     * implementations provided in the Circle and Rectangle classes.
     * The ShapeFactory class is used to get the shape objects and store them in a
     * map to avoid creating duplicate objects.
     *
     * @param numberOfShapes the number of shapes to be drawn
     */
    public void render(int numberOfShapes) {
        for (int i = 0; i < numberOfShapes; i++) {
            Shape shape = (i % 2 == 0)
                    ? ShapeFactory.getShape("circle")
                    : ShapeFactory.getShape("rectangle");

            if (shape instanceof Circle) {
                shape.draw(10, "red", "green");
            } else if (shape instanceof Rectangle) {
                shape.draw(i + i, 20, "dotted");
            }
        }
    }
}
