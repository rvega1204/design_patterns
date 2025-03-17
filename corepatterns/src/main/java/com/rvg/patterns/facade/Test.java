package com.rvg.patterns.facade;

/**
 * The Test class demonstrates the use of the OrderFacade to place an order.
 * It creates an instance of the OrderFacade and calls the placeOrder method to place an order for a MacBook.
 * The OrderFacade internally handles the order processing operations using the OrderProcesor class.
 */
public class Test {

    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("MacBook", 2);
    }
}
