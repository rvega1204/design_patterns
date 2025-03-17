/**
 * VeggiePizzaDecorator is a concrete decorator class that extends the PizzaDecorator.
 * It adds additional behavior to the bake method by including a step to add veggies.
 * 
 * <p>This class is part of the Decorator Design Pattern implementation, which allows
 * for dynamically adding responsibilities to objects.</p>
 * 
 * @see PizzaDecorator
 */
package com.rvg.patterns.decorator;


public class VeggiePizzaDecorator extends PizzaDecorator {

    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Adding veggies");
    }

}
