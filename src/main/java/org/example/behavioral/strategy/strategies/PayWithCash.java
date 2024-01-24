package org.example.behavioral.strategy.strategies;

import org.example.behavioral.strategy.models.Order;

public class PayWithCash implements PayStrategy{
    @Override
    public boolean pay(Order order) {
        System.out.println("Cash ile ödendi.");
        return false;
    }
}
