package com.rvg.patterns.abstractFactory;

/**
 * The Test class demonstrates the Abstract Factory design pattern.
 * It creates instances of Dao objects using the DaoFactoryProducer class.
 * The DaoFactoryProducer class produces instances of DaoAbstractFactory based
 * on the provided factory type.
 * The DaoAbstractFactory class is responsible for creating instances of Dao
 * objects.
 * The XMLDaoFactory and DBDaoFactory classes are concrete factories that create
 * instances of Dao objects that interact with XML files and databases,
 * respectively.
 */
public class Test {

    public static void main(String[] args) {
        executeSaveOperation("xml", "emp");
        executeSaveOperation("db", "emp");
        executeSaveOperation("xml", "dept");
        executeSaveOperation("db", "dept");
    }

    private static void executeSaveOperation(String factoryType, String daoType) {
        DaoAbstractFactory factory = DaoFactoryProducer.produce(factoryType);
        Dao dao = factory.createDao(daoType);
        dao.save();
    }
}
