package com.rvg.patterns.factory;

/**
 * Test class for the PersonFactory class.
 */
public class PersonTest {

    public static void main(String[] args) {
        Person p = PersonFactory.creatPerson("MaLe");
        p.wish("car");

        Person p1 = PersonFactory.creatPerson("FEMALE");
        p1.wish("boat");
    }
}
