/**
 * The CustomerProxyImpl class implements the Customer interface and acts as a proxy to the CustomerImpl class.
 * It provides controlled access to the CustomerImpl class and its methods.
 * 
 * <p>This class demonstrates the Proxy Design Pattern, where it controls access to the actual implementation
 * of the Customer interface.</p>
 * 
 * <p>Methods:</p>
 * <ul>
 *   <li>{@link #getId()}: Retrieves the ID of the customer.</li>
 *   <li>{@link #getOrders()}: Retrieves a list of orders for the customer. This method creates and returns
 *       a list of sample orders for demonstration purposes.</li>
 * </ul>
 * 
 * <p>Note: The getOrders method in this proxy implementation returns a hardcoded list of orders instead of
 * delegating the call to the CustomerImpl class.</p>
 * 
 * @see Customer
 * @see CustomerImpl
 */
package com.rvg.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {

    private CustomerImpl customer = new CustomerImpl();

    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        Order order1 = new Order();
        order1.setId(1);
        order1.setProductName("Iphone");
        order1.setQuantity(50);
        orders.add(order1);

        Order order2 = new Order();
        order2.setId(2);
        order2.setProductName("Z Flip 6");
        order2.setQuantity(100);
        orders.add(order2);

        return orders;
    }

}
