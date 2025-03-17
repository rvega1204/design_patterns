package com.rvg.patterns.flyweight;

/*
 * Circle class is a concrete implementation of Shape class
 * It has a label field which is set to "Circle" in the constructor
 * It overrides the draw method to draw a circle with radius, fill color and line color
 */
public class Circle extends Shape {

    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Circle() {
        label = "Circle";
    }

    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println("Drawing a " + label + " with radius " + radius + " fill color " + fillColor
                + " and line color " + lineColor);
    }

}
