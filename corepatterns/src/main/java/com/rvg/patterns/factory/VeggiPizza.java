package com.rvg.patterns.factory;

/**
 * VeggiPizza is a class that represents a veggi pizza.
 * 
 * Methods:
 * - prepare(): Prepares the veggi pizza.
 * - bake(): Bakes the veggi pizza.
 * - cut(): Cuts the veggi pizza.
 */
public class VeggiPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Veggi Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veggi Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Veggi Pizza");
    }

}
