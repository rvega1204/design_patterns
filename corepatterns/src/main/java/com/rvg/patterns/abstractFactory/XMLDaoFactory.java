package com.rvg.patterns.abstractFactory;

/**
 * The XMLDaoFactory class is responsible for creating instances of XMLDao
 * objects.
 * It serves as a concrete factory in the Abstract Factory design pattern.
 */
public class XMLDaoFactory extends DaoAbstractFactory {

    @Override
    public Dao createDao(String type) {
        switch (type.toLowerCase()) {
            case "emp":
                return new XMLEmpDao();
            case "dept":
                return new XMLDeptDao();
            default:
                throw new IllegalArgumentException("Invalid DAO type: " + type);
        }
    }

}
