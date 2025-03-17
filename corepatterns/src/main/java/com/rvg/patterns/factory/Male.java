/**
 * The Male class implements the Person interface and represents a male person.
 * This class provides an implementation for the wish method, which prints a 
 * message indicating the wish of the male person.
 * 
 * <p>Example usage:</p>
 * <pre>
 *     Male male = new Male();
 *     male.wish("a new car");
 * </pre>
 * 
 * @see Person
 */
package com.rvg.patterns.factory;

public class Male implements Person {

    @Override
    public void wish(String msg) {
        System.out.println("Male wishes for: " + msg);
    }
}
