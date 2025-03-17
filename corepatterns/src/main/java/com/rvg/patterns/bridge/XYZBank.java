/**
 * XYZBank is a concrete implementation of the Bank interface.
 * This class provides the functionality to process payments.
 * 
 * <p>Example usage:</p>
 * <pre>
 *     Bank bank = new XYZBank();
 *     bank.processPayment("123456789", 1000.00);
 * </pre>
 * 
 * @see Bank
 */
package com.rvg.patterns.bridge;


public class XYZBank implements Bank {

    @Override
    public void processPayment(String accountNumber, double amount) {
        System.out.println("Processing payment of " + amount + " for account number " + accountNumber + " with XYZ Bank");
    }

}
