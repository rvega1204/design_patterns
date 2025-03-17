/**
 * PlainPizza is a concrete implementation of the Pizza interface.
 * It represents a basic pizza with no additional toppings or decorations.
 * 
 * This class provides the implementation for the bake method, which
 * outputs a message indicating that a plain pizza is being baked.
 * 
 * Usage:
 * <pre>
 *     Pizza pizza = new PlainPizza();
 *     pizza.bake();
 * </pre>
 * 
 * Output:
 * <pre>
 *     Baking plain pizza
 * </pre>
 * 
 * @see Pizza
 */
package com.rvg.patterns.decorator;


public class PlainPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking plain pizza");
    }

}
