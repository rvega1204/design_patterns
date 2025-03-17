package com.rvg.patterns.iterator;

/**
 * The {@code Product} class represents a product with a name.
 * It provides methods to get and set the name of the product.
 * <p>
 * This class is part of the iterator pattern example.
 * </p>
 */
public class Product {

    /**
     * The name of the product.
     */
    private String name;

    /**
     * Constructs a new {@code Product} with the specified name.
     *
     * @param name the name of the product
     */
    public Product(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the product.
     *
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     *
     * @param name the new name of the product
     */
    public void setName(String name) {
        this.name = name;
    }
}
