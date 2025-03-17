package com.rvg.patterns.iterator;

/**
 * Test is the client code that uses the iterator pattern to iterate over a collection of Product objects.
 * It creates a ProductCollection object and adds Product objects to it.
 * It then creates an iterator to traverse the collection and prints the names of the products.
 */
public class Test {

    public static void main(String[] args) {
        ProductCollection productCollection = new ProductCollection(new Product[10]);
        productCollection.addProduct(new Product("Product 1"));
        productCollection.addProduct(new Product("Product 2"));
        productCollection.addProduct(new Product("Product 3"));
        productCollection.addProduct(new Product("Product 4"));
        productCollection.addProduct(new Product("Product 5"));
        productCollection.addProduct(new Product("Product 6"));
        productCollection.addProduct(new Product("Product 7"));
        productCollection.addProduct(new Product("Product 8"));
        productCollection.addProduct(new Product("Product 9"));
        productCollection.addProduct(new Product("Product 10"));

        Iterator iterator = productCollection.createIterator();
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.println(product.getName());
        }
    }
}
