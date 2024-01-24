package org.example.behavioral.strategy.strategies;

import org.example.behavioral.strategy.models.Order;

public class PayWithPayPal implements PayStrategy{
    @Override
    public boolean pay(Order order) {
        System.out.println("PayPal ile ödendi.");
        return false;
    }
}
