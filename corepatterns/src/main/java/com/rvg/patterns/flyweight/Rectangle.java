package com.rvg.patterns.flyweight;

/*
 * Circle class is a concrete implementation of Shape class
 * It has a label field which is set to "Circle" in the constructor
 * It overrides the draw method to draw a circle with radius, fill color and line color
 */
public class Rectangle extends Shape {

    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Rectangle() {
        label = "Rectangle";
    }

    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drawing a " + label + " with breadth " + breadth + " fill Style " + fillStyle
                + " and length " + length);
    }

    

}
