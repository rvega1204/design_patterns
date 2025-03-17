package com.rvg.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
 * ShapeFactory class is a factory class that returns a shape object based on the type of shape requested
 * It maintains a map of shape objects to avoid creating duplicate objects
 * It has a getShape method which takes the type of shape as input and returns the shape object
 * If the shape object is already present in the map, it returns the object from the map
 * If the shape object is not present in the map, it creates a new object, stores it in the map and returns the object
 */
public class ShapeFactory {

    private static Map<String, Shape> shapes = new HashMap<>();
    
    /*
     * getShape method returns a shape object based on the type of shape requested
     * If the shape object is already present in the map, it returns the object from the map
     * If the shape object is not present in the map, it creates a new object, stores it in the map and returns the object
     */
    public static Shape getShape(String type) {
        Shape shape = null;
        if (shapes.get(type) != null) {
            shape = shapes.get(type);
        } else {
            if (type.equalsIgnoreCase("circle")) {
                shape = new Circle();
            } else if (type.equalsIgnoreCase("rectangle")) {
                shape = new Rectangle();
            }

            shapes.put(type, shape);
        }

        return shape;
    }
}
