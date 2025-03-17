package com.rvg.patterns.adapter;

/*
 * Adapter pattern is used to provide a link between two otherwise incompatible types by wrapping the "adaptee" 
 * with a class that supports the interface required by the client.
 */
public interface PaymentProcessor {

    int pay(int dollars);
}
