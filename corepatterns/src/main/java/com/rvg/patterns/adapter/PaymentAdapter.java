package com.rvg.patterns.adapter;

/*
 * This is the adapter class. It is the class that adapts the adaptee class to the client interface.
 * In this case, the PaymentAdapter class is the adapter class.
 */
public class PaymentAdapter {

    public int pay(int colones) {
        PaymentProcessor processor = new PaymentProcessorImpl();
        int dollars = colones / 500;
        return processor.pay(dollars);
    }
}
