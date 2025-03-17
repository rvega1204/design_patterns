package com.rvg.patterns.decorator;

/**
 * The PizzaShop class demonstrates the use of the Decorator Design Pattern
 * by creating a plain pizza and decorating it with additional toppings.
 * 
 * <p>This class is part of the Decorator Design Pattern implementation.</p>
 * 
 * @see PlainPizza
 * @see CheesePizzaDecorator
 * @see VeggiePizzaDecorator
 */
public class PizzaShop {

    public static void main(String[] args) {
        Pizza pizza = new CheesePizzaDecorator(new PlainPizza());
        pizza.bake();

        pizza = new VeggiePizzaDecorator(new PlainPizza());
        pizza.bake();
    }
}
