/**
 * The Bank interface represents a bank that can process payments.
 * It provides a method to process a payment given an account number and an amount.
 * @author rvega
 */
package com.rvg.patterns.bridge;

public interface Bank {

    void processPayment(String accountNumber, double amount);
}
