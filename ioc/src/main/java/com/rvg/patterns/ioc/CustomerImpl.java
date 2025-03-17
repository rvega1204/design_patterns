package com.rvg.patterns.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * This is the implementation of the Customer interface.
 * The pay method is implemented here.
 * The CreditCard dependency is injected using the constructor.
 */
@Component
public class CustomerImpl implements Customer {

    //@Autowired
    private CreditCard creditCard;

    @Autowired
    CustomerImpl(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    //@Autowired
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void pay() {
        creditCard.makePayment();
    }

}
