package com.rvg.patterns.factory;

/**
 * PizzaFactory is a factory class that creates pizza objects based on the type
 * of pizza requested.
 * 
 * Methods:
 * - createPizza(String type): Creates a pizza object based on the type of pizza
 * requested.
 */
public class PizzaFactory {

    public static Pizza createPizza(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Pizza type cannot be null or empty");
        }

        return switch (type.toLowerCase()) {
            case "cheese" -> new CheesePizza();
            case "veggi" -> new VeggiPizza();
            case "chicken" -> new ChickenPizza();
            default -> throw new IllegalArgumentException("Unknown pizza type: " + type);
        };
    }
}
