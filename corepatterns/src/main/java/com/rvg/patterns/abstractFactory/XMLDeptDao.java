package com.rvg.patterns.abstractFactory;

/**
 * The XMLDeptDao class is responsible for saving Department data to an XML file.
 * It serves as a concrete product in the Abstract Factory design pattern.
 */
public class XMLDeptDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Department to XML");
    }

}
