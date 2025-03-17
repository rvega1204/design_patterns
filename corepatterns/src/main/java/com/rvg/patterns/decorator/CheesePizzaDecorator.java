/**
 * CheesePizzaDecorator is a concrete decorator class that extends the PizzaDecorator.
 * It adds additional behavior to the bake method of the Pizza component by adding cheese.
 * 
 * <p>This class is part of the Decorator Design Pattern implementation.</p>
 * 
 * @see Pizza
 * @see PizzaDecorator
 */
package com.rvg.patterns.decorator;


public class CheesePizzaDecorator extends PizzaDecorator {

    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding chesse");
    }
}
