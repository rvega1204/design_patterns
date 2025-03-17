package com.rvg.patterns.templatemethod;

/*
 * This is the concrete class that extends the abstract class ComputerManufacturer
 * This class implements the addHardisk(), addRam() and addKeyboard() methods
 * These methods are called by the template method buildComputer()
 */
public class LaptopManufacturer extends ComputerManufacturer {

    @Override
    public void addHardisk() {
        System.out.println("Adding HD to laptop");
    }

    @Override
    public void addRam() {
        System.out.println("Adding RAM to laptop");
    }

    @Override
    public void addKeyboard() {
        System.out.println("Adding Keyboard to laptop");
    }

}
