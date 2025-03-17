package com.rvg.patterns.ioc;

import org.springframework.stereotype.Component;

/*
 * This is the implementation of the CreditCard interface.
 * The makePayment method is implemented here.
 */
@Component
public class CreditCardImpl implements CreditCard{

    @Override
    public void makePayment() {
        System.out.println("Payment made");
    }

}
