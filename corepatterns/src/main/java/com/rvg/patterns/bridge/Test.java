/**
 * The Test class demonstrates the Bridge design pattern by creating instances of different banks
 * and making payments using different payment methods.
 * 
 * In this example:
 * - ABCBank and XYZBank are concrete implementations of the Bank interface.
 * - UPIPayment and CardPayment are concrete implementations of the Payment abstract class.
 * 
 * The main method performs the following actions:
 * 1. Creates an instance of ABCBank and XYZBank.
 * 2. Creates an instance of UPIPayment with ABCBank and makes a payment.
 * 3. Creates an instance of CardPayment with XYZBank and makes a payment.
 */
package com.rvg.patterns.bridge;

public class Test {

    public static void main(String[] args) {
        ABCBank abcBank = new ABCBank();
        XYZBank xyzBank = new XYZBank();

        UPIPayment upiPayment = new UPIPayment(abcBank);
        upiPayment.makePayment("abc123", 100);

        CardPayment cardPayment = new CardPayment(xyzBank);
        cardPayment.makePayment("xyz456", 200);
    }
}
