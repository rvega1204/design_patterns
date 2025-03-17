/**
 * UPIPayment is a concrete implementation of the Payment class.
 * It represents a payment method using UPI (Unified Payments Interface).
 * 
 * This class overrides the makePayment method to provide the specific
 * implementation for UPI payments.
 * 
 * @param accountNumber The account number to which the payment is to be made.
 * @param amount The amount to be paid.
 * 
 * The constructor takes a Bank object which is used to process the payment.
 * 
 * Example usage:
 * Bank bank = new SomeConcreteBank();
 * Payment payment = new UPIPayment(bank);
 * payment.makePayment("1234567890", 1000.0);
 */
package com.rvg.patterns.bridge;

public class UPIPayment extends Payment {

    @Override
    public void makePayment(String accountNumber, double amount) {
        System.out.println("Using UPI Payment");
        bank.processPayment(accountNumber, amount);
    }

    public UPIPayment(Bank bank) {
        super(bank);
    }

}
