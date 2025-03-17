package com.rvg.patterns.ioc;

/*
 * This is the interface for the CreditCard.
 * The CreditCardImpl class implements this interface.
 * Dependency Injection is done in the CustomerImpl class.
 * Inversion of Control is achieved by using the @Component annotation.
 */
public interface CreditCard {

    void makePayment();
}
