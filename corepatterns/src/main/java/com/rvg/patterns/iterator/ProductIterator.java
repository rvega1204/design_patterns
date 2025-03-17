package com.rvg.patterns.iterator;

/**
 * ProductIterator is an implementation of the Iterator interface for an array of Product objects.
 * It provides methods to iterate over the Product array.
 */
public class ProductIterator implements Iterator {

    // Current index in the iteration
    private int index = 0;
    
    // Array of Product objects to iterate over
    private Product[] products;

    /**
     * Constructs a ProductIterator with the specified array of Product objects.
     *
     * @param products the array of Product objects to iterate over
     */
    public ProductIterator(Product[] products) {
        this.products = products;
    }

    /**
     * Checks if there are more elements in the array to iterate over.
     *
     * @return true if there are more elements, false otherwise
     */
    @Override
    public boolean hasNext() {
        return index < products.length && products[index] != null;
    }

    /**
     * Returns the next element in the array.
     *
     * @return the next Product object in the array
     */
    @Override
    public Object next() {
        return products[index++];
    }
}
