/**
 * ABCBank is a concrete implementation of the Bank interface.
 * This class provides the functionality to process payments.
 * 
 * <p>
 * It overrides the processPayment method to handle the payment processing
 * logic specific to ABC Bank.
 * </p>
 * 
 * @see Bank
 */
package com.rvg.patterns.bridge;


public class ABCBank implements Bank {

    @Override
    public void processPayment(String accountNumber, double amount) {
        System.out.println("Processing payment of " + amount + " for account number " + accountNumber + " with ABC Bank");
    }

}
