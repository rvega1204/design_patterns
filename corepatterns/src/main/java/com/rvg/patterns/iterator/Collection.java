package com.rvg.patterns.iterator;

/**
 * Collection is an interface for creating an Iterator object.
 * It provides a method to create an Iterator object.
 */
public interface Collection {

    public Iterator createIterator();
}
