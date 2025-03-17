package com.rvg.patterns.templatemethod;

// This is the abstract class that defines the template method
// The template method is the buildComputer() method
// The buildComputer() method calls the addHardisk(), addRam() and addKeyboard() methods
// The addHardisk(), addRam() and addKeyboard() methods are abstract and must be implemented by the subclasses
// The subclasses are DesktopManufacturer and LaptopManufacturer
// The DesktopManufacturer and LaptopManufacturer classes implement the addHardisk(), addRam() and addKeyboard() methods
public abstract class ComputerManufacturer {

    public void buildComputer() {
        addHardisk();
        addRam();
        addKeyboard();
    }

    public abstract void addHardisk();

    public abstract void addRam();

    public abstract void addKeyboard();
}
