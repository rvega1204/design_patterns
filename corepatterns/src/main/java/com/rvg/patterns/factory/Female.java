/**
 * The Female class implements the Person interface and represents a female person.
 * This class provides an implementation for the wish method, which prints a message
 * indicating the wish of the female person.
 * 
 * <p>Example usage:</p>
 * <pre>
 *     Female female = new Female();
 *     female.wish("world peace");
 * </pre>
 * 
 * @see Person
 */
package com.rvg.patterns.factory;


public class Female implements Person {

    @Override
    public void wish(String msg) {
        System.out.println("Female wishes for: " + msg);
    }
}
