package com.rvg.patterns.abstractFactory;

/**
 * The DaoAbstractFactory class is responsible for creating instances of Dao objects.
 * It serves as an abstract factory in the Abstract Factory design pattern.
 */
public abstract class DaoAbstractFactory {

    public abstract Dao createDao(String type);
}
