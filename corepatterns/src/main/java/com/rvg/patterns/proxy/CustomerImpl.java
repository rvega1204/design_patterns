/**
 * Implementation of the Customer interface.
 * This class represents a customer with an ID and a list of orders.
 * 
 * <p>
 * The CustomerImpl class provides methods to set and get the customer's ID and orders.
 * </p>
 * 
 * <p>
 * Example usage:
 * <pre>
 * {@code
 * CustomerImpl customer = new CustomerImpl();
 * customer.setId(456);
 * List<Order> orders = new ArrayList<>();
 * customer.setOrders(orders);
 * int id = customer.getId();
 * List<Order> customerOrders = customer.getOrders();
 * }
 * </pre>
 * </p>
 * 
 * @author rvega
 */
package com.rvg.patterns.proxy;

import java.util.List;

public class CustomerImpl implements Customer {

    private int id;
    private List<Order> orders;

    public CustomerImpl() {
        this.id = 123;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
