/**
 * The Test class demonstrates the use of the Proxy design pattern.
 * It creates a Customer object using a proxy implementation and retrieves
 * the customer's ID and orders.
 * 
 * The main method performs the following steps:
 * 1. Creates a Customer object using the CustomerProxyImpl.
 * 2. Prints the customer's ID.
 * 3. Retrieves and prints the number of orders.
 * 4. Iterates through the list of orders and prints the details of each order.
 * 
 * Usage:
 * Run the main method to see the output of the customer's ID and order details.
 * 
 * Note:
 * Ensure that the CustomerProxyImpl and Order classes are properly implemented
 * and available in the classpath.
 */
package com.rvg.patterns.proxy;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Customer customer = new CustomerProxyImpl();
        System.out.println("Customer ID: " + customer.getId());
        
        List<Order> orders = customer.getOrders();
        System.out.println("Orders: " + orders.size());
        
        for (Order order : orders) {
            System.out.println("Order #" + order.getId() + ": product name -> " + order.getProductName() + " quantity -> " + order.getQuantity());
        }
    }
}
