/**
 * The PizzaDecorator class implements the Pizza interface and serves as a base decorator class
 * for adding additional functionalities to a Pizza object.
 * It holds a reference to a Pizza object and delegates the bake method to the wrapped Pizza object.
 */
package com.rvg.patterns.decorator;


public class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void bake() {
        pizza.bake();
    }

}
