/**
 * CheesePizza is a concrete implementation of the Pizza interface.
 * This class provides specific implementations for preparing, baking,
 * and cutting a cheese pizza.
 * 
 * Methods:
 * - prepare(): Prepares the cheese pizza by printing a message to the console.
 * - bake(): Bakes the cheese pizza by printing a message to the console.
 * - cut(): Cuts the cheese pizza by printing a message to the console.
 */
package com.rvg.patterns.factory;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese Pizza");
    }

}
