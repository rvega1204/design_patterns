/**
 * The Television class represents a simple television with basic on and off functionalities.
 * It provides methods to turn the television on and off, printing the corresponding state to the console.
 * 
 * Usage example:
 * <pre>
 *     Television tv = new Television();
 *     tv.on();  // Turns the television on
 *     tv.off(); // Turns the television off
 * </pre>
 */
package com.rvg.patterns.command;


public class Television {

    public void on() {
        System.out.println("Television is on");
    }

    public void off() {
        System.out.println("Television is off");
    }
}
