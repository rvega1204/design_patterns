package com.rvg.patterns.abstractFactory;

/**
 * The DBDaoFactory class is responsible for creating instances of Dao objects
 * that interact with a database. It serves as a concrete factory in the Abstract
 * Factory design pattern.
 */
public class DBDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if ("emp".equals(type)) {
            dao = new DBEmpDao();
        } else if ("dept".equals(type)) {
            dao = new DBDeptDao();
        }
        
        return dao;
    }

}
