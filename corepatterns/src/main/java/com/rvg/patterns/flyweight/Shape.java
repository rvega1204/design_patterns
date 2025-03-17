/**
 * The Shape class is an abstract class that defines the structure for different shapes.
 * It provides two overloaded draw methods to draw shapes with different parameters.
 * 
 * <p>Subclasses should provide concrete implementations for these draw methods.</p>
 * 
 * <p>Method details:</p>
 * <ul>
 *   <li>{@code draw(int radius, String fillColor, String lineColor)}: Draws a shape with the specified radius, fill color, and line color.</li>
 *   <li>{@code draw(int length, int breadth, String fillStyle)}: Draws a shape with the specified length, breadth, and fill style.</li>
 * </ul>
 */
package com.rvg.patterns.flyweight;

public abstract class Shape {

    public void draw(int radius, String fillColor, String lineColor) {}

    public void draw(int length, int breadth, String fillStyle) {}
    
}