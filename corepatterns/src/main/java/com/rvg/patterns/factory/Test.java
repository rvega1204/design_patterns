package com.rvg.patterns.factory;

/**
 * Test is a class that tests the factory pattern implementation.
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
