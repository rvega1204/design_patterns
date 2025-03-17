package com.rvg.patterns.iterator;

/**
 * Iterator is an interface for creating an Iterator object.
 * It provides methods to check if there are more elements in the iteration and to get the next element.
 */
public interface Iterator {

    boolean hasNext();

    Object next();
}
