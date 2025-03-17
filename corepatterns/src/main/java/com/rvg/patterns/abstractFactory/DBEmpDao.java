package com.rvg.patterns.abstractFactory;

/**
 * The DBEmpDao class is responsible for saving Employee data to a database.
 * It serves as a concrete product in the Abstract Factory design pattern.
 */
public class DBEmpDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Employee to DB");
    }

}
