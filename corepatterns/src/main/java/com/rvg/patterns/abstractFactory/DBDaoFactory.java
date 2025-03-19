package com.rvg.patterns.abstractFactory;

/**
 * The DBDaoFactory class is responsible for creating instances of Dao objects
 * that interact with a database. It serves as a concrete factory in the
 * Abstract
 * Factory design pattern.
 */
public class DBDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) {
        switch (type.toLowerCase()) {
            case "emp":
                return new DBEmpDao();
            case "dept":
                return new DBDeptDao();
            default:
                throw new IllegalArgumentException("Unknown DAO type: " + type);
        }
    }

}
