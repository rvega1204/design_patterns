package com.rvg.patterns.adapter;

/*
 * This is the client class. It is the class that needs to use the adaptee class.
 * In this case, the PaymentApp class is the client class.
 * The PaymentApp class uses the PaymentAdapter class to adapt the PaymentProcessorImpl class to the PaymentProcessor interface.
 */
public class PaymentApp {

    public void pay(int colones) {
        PaymentAdapter adapter = new PaymentAdapter();
        System.out.println("Paid in dollars: " + adapter.pay(colones));
    }

    public static void main(String[] args) {
        PaymentApp app = new PaymentApp();
        app.pay(1000);
    }
}
