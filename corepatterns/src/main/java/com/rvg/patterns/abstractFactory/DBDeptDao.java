package com.rvg.patterns.abstractFactory;

/**
 * The DBDeptDao class is responsible for saving Department data to a database.
 * It serves as a concrete product in the Abstract Factory design pattern.
 */
public class DBDeptDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Department to DB");
    }

}
