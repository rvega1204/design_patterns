package com.rvg.patterns.facade;

/**
 * The OrderProcesor class provides methods to check stock, place orders, and ship orders.
 * It acts as a facade for order processing operations.
 */
public class OrderProcesor {

    /**
     * Checks the stock availability for a given product name.
     *
     * @param name the name of the product to check stock for
     * @return true if the product is in stock, false otherwise
     */
    public boolean checkStock(String name) {
        System.out.println("Checking stock for " + name);
        return true;
    }

    /**
     * Places an order for a specified quantity of a given product.
     *
     * @param name the name of the product to order
     * @param quantity the quantity of the product to order
     * @return a string representing the order ID
     */
    public String placeOrder(String name, int quantity) {
        System.out.println("Placing order for " + quantity + " " + name);
        return "abc1234";
    }

    /**
     * Ships an order based on the provided order ID.
     *
     * @param orderId the ID of the order to ship
     */
    public void shipOrder(String orderId) {
        System.out.println("Shipping order " + orderId);
    }
}
