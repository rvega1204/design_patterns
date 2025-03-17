package com.rvg.patterns.templatemethod;

/*
 * Concrete implementation of the template method
 * buildComputer() method is the template method
 * addHardisk(), addRam() and addKeyboard() are the abstract methods
 * These methods are implemented by the subclasses
 */
public class DesktopManufacturer extends ComputerManufacturer {

    @Override
    public void addHardisk() {
        System.out.println("Adding HD to desktop");
    }

    @Override
    public void addRam() {
        System.out.println("Adding RAM to desktop");
    }

    @Override
    public void addKeyboard() {
        System.out.println("Adding Keyboard to desktop");
    }

}
