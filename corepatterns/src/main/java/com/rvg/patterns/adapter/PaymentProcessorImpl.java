package com.rvg.patterns.adapter;

/*
 * This is the adaptee class. It is the class that needs to be adapted to the client interface.
 * In this case, the PaymentProcessorImpl class is the adaptee class.
 */
public class PaymentProcessorImpl implements PaymentProcessor {

    @Override
    public int pay(int dollars) {
        return dollars;
    }

}
