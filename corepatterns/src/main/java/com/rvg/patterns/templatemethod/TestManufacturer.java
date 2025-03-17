package com.rvg.patterns.templatemethod;

/*
 * Test class to test the template method pattern
 * The template method is the buildComputer() method in the ComputerManufacturer class
 * The subclasses DesktopManufacturer and LaptopManufacturer implement the addHardisk(), addRam() and addKeyboard() methods
 * The buildComputer() method calls the addHardisk(), addRam() and addKeyboard() methods
 */
public class TestManufacturer {

    public static void main(String[] args) {
        ComputerManufacturer manufacturer = new DesktopManufacturer();
        manufacturer.buildComputer();

        manufacturer = new LaptopManufacturer();
        manufacturer.buildComputer();
    }
}
