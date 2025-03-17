/**
 * The Customer interface represents a customer with an ID and a list of orders.
 * It provides methods to retrieve the customer's ID and their orders.
 */
package com.rvg.patterns.proxy;

import java.util.List;

public interface Customer {

    int getId();
    List<Order> getOrders();
}
