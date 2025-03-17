package com.rvg.patterns.factory;

/**
 * PizzaStore is a class that represents a pizza store.
 * This class provides a method for ordering a pizza.
 * 
 * Methods:
 * - orderPizza(String type): Orders a pizza of the specified type.
 */
public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza p = PizzaFactory.createPizza(type);
        p.prepare();
        p.bake();
        p.cut();

        return p;
    }
}
