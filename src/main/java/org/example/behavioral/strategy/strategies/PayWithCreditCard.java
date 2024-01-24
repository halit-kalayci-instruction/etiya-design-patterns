package org.example.behavioral.strategy.strategies;

import org.example.behavioral.strategy.models.Order;

public class PayWithCreditCard implements PayStrategy{
    @Override
    public boolean pay(Order order) {
        System.out.println("Kart ile ödendi.");
        return false;
    }
}
