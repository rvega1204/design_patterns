/**
 * The Order class represents an order with an id, product name, and quantity.
 * It provides getter and setter methods to access and modify these properties.
 * 
 * <p>Example usage:</p>
 * <pre>
 *     Order order = new Order();
 *     order.setId(1);
 *     order.setProductName("Laptop");
 *     order.setQuantity(2);
 * </pre>
 * 
 * <p>Properties:</p>
 * <ul>
 *     <li>id - the unique identifier for the order</li>
 *     <li>productName - the name of the product being ordered</li>
 *     <li>quantity - the quantity of the product being ordered</li>
 * </ul>
 */
package com.rvg.patterns.proxy;

public class Order {

    private int id;
    private String productName;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
