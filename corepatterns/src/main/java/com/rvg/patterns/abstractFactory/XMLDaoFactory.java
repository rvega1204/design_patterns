package com.rvg.patterns.abstractFactory;

/**
 * The XMLDaoFactory class is responsible for creating instances of XMLDao objects.
 * It serves as a concrete factory in the Abstract Factory design pattern.
 */
public class XMLDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if ("emp".equals(type)) {
            dao = new XMLEmpDao();
        } else if ("dept".equals(type)) {
            dao = new XMLDeptDao();
        }
        
        return dao;
    }

}
