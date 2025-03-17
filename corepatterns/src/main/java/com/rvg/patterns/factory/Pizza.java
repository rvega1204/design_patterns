package com.rvg.patterns.factory;

/**
 * Pizza is an interface that defines the methods that all pizza classes must implement.
 * 
 * Methods:
 * - prepare(): Prepares the pizza.
 * - bake(): Bakes the pizza.
 * - cut(): Cuts the pizza.
 */
public interface Pizza {

    void prepare();

    void bake();

    void cut();
}
