/**
 * The DaoFactoryProducer class is responsible for producing instances of DaoAbstractFactory
 * based on the provided factory type. It serves as a factory producer in the Abstract Factory
 * design pattern.
 */
package com.rvg.patterns.abstractFactory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String factoryType) {
        if (factoryType == null || factoryType.isEmpty()) {
            throw new IllegalArgumentException("Factory type must not be null or empty");
        }

        switch (factoryType.toLowerCase()) {
            case "xml":
                return new XMLDaoFactory();
            case "db":
                return new DBDaoFactory();
            default:
                throw new UnsupportedOperationException("Unsupported factory type: " + factoryType);
        }
    }
}
