package com.rvg.patterns.facade;

/**
 * The OrderFacade class provides a simplified interface for placing and processing orders.
 * It hides the complexities of the underlying order processing system.
 * It acts as a facade for order processing operations.
 * @author rvega
 */
public class OrderFacade {

    // Instance of OrderProcesor to handle order-related operations
    private OrderProcesor orderProcesor = new OrderProcesor();

    /**
     * Places an order for a specified product and quantity.
     * 
     * @param name     the name of the product to order
     * @param quantity the quantity of the product to order
     */
    public void placeOrder(String name, int quantity) {
        // Check if the product is in stock
        if (orderProcesor.checkStock(name)) {
            // Place the order and get the order ID
            String orderId = orderProcesor.placeOrder(name, quantity);
            // Ship the order using the order ID
            orderProcesor.shipOrder(orderId);    
        }
    }
}
