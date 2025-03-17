package com.rvg.patterns.factory;

/**
 * PizzaFactory is a factory class that creates pizza objects based on the type of pizza requested.
 * 
 * Methods:
 * - createPizza(String type): Creates a pizza object based on the type of pizza requested.
 */
public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza p = null;
        if (type.equals("cheese")) {
            p = new CheesePizza();
        } else if (type.equals("veggi")) {
            p = new VeggiPizza();
        } else if (type.equals("chicken")) {
            p = new ChickenPizza();
        }

        return p;
    }
}
