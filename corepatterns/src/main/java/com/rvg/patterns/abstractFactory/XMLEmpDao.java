package com.rvg.patterns.abstractFactory;

/**
 * The XMLEmpDao class is responsible for saving Employee data to an XML file.
 * It serves as a concrete product in the Abstract Factory design pattern.
 */
public class XMLEmpDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Employee to XML");
    }

}
