/**
 * Factory class for creating Person objects based on gender.
 */
package com.rvg.patterns.factory;

public class PersonFactory {

    public static Person creatPerson(String gender) {
        Person p = null;
        if (gender.equalsIgnoreCase("male")) {
            p = new Male();
        } else if (gender.equalsIgnoreCase("female")) {
            p = new Female();
        }

        return p;
    }
}
