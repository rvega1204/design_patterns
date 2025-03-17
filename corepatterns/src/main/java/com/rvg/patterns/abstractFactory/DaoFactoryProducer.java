/**
 * The DaoFactoryProducer class is responsible for producing instances of DaoAbstractFactory
 * based on the provided factory type. It serves as a factory producer in the Abstract Factory
 * design pattern.
 */
package com.rvg.patterns.abstractFactory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String factoryType) {
        DaoAbstractFactory daf = null;
        if ("xml".equals(factoryType)) {
            daf = new XMLDaoFactory();
        } else if ("db".equals(factoryType)) {
            daf = new DBDaoFactory();
        }

        return daf;
    }
}
