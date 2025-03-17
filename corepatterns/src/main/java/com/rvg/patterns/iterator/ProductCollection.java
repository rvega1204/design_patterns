package com.rvg.patterns.iterator;

/**
 * ProductCollection is a concrete implementation of the Collection interface.
 * It holds an array of Product objects and provides methods to add products
 * and create an iterator to traverse the collection.
 * @author rvega
 */
public class ProductCollection implements Collection {

    // Array to store Product objects
    private Product[] products;
    
    // Counter to keep track of the number of products added
    int numberOfProducts = 0;

    /**
     * Constructor to initialize the ProductCollection with a specified size.
     * 
     * @param products An array of Product objects to initialize the collection.
     */
    public ProductCollection(Product[] products) {
        this.products = new Product[10];
    }

    /**
     * Adds a Product to the collection.
     * 
     * @param product The Product object to be added to the collection.
     */
    public void addProduct(Product product) {
        products[numberOfProducts++] = product;
    }

    /**
     * Creates an iterator to traverse the ProductCollection.
     * 
     * @return An Iterator object to iterate over the products.
     */
    @Override
    public Iterator createIterator() {
        return new ProductIterator(products);
    }
}
