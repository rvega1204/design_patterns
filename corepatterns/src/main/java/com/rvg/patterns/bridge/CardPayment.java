/**
 * The CardPayment class extends the Payment class and provides an implementation
 * for making payments using a credit card.
 * 
 * <p>This class overrides the makePayment method to specify the payment process
 * using a credit card. It uses the Bank instance to process the payment.
 * 
 * <p>Usage example:
 * <pre>
 *     Bank bank = new SomeConcreteBank();
 *     Payment payment = new CardPayment(bank);
 *     payment.makePayment("1234567890", 100.0);
 * </pre>
 * 
 * @see Payment
 * @see Bank
 */
package com.rvg.patterns.bridge;

public class CardPayment extends Payment {

    @Override
    public void makePayment(String accountNumber, double amount) {
        System.out.println("Using Credit Card Payment");
        bank.processPayment(accountNumber, amount);
    }

    public CardPayment(Bank bank) {
        super(bank);
    }

}
