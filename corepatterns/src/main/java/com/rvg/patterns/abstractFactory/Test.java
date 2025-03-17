package com.rvg.patterns.abstractFactory;

/**
 * The Test class demonstrates the Abstract Factory design pattern.
 * It creates instances of Dao objects using the DaoFactoryProducer class.
 * The DaoFactoryProducer class produces instances of DaoAbstractFactory based on the provided factory type.
 * The DaoAbstractFactory class is responsible for creating instances of Dao objects.
 * The XMLDaoFactory and DBDaoFactory classes are concrete factories that create instances of Dao objects that interact with XML files and databases, respectively.
 */
public class Test {

    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("xml");
        Dao dao = daf.createDao("emp");
        dao.save();

        daf = DaoFactoryProducer.produce("db");
        dao = daf.createDao("emp");
        dao.save();

        daf = DaoFactoryProducer.produce("xml");
        dao = daf.createDao("dept");
        dao.save();

        daf = DaoFactoryProducer.produce("db");
        dao = daf.createDao("dept");
        dao.save();
    }
}
