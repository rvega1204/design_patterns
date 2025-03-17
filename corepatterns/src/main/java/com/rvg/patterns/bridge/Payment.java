/**
 * The Payment class serves as an abstraction in the Bridge design pattern.
 * It holds a reference to a Bank object and delegates the payment process to the concrete implementation of the Bank.
 * 
 * <p>This class is intended to be extended by concrete payment types that will implement the makePayment method.</p>
 * 
 * @param bank the bank implementation that will process the payment
 */
package com.rvg.patterns.bridge;

public abstract class Payment {

    protected Bank bank;

    public Payment(Bank bank) {
        this.bank = bank;
    }

    public abstract void makePayment(String accountNumber, double amount);
}
