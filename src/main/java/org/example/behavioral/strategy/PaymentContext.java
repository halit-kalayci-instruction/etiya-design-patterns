package org.example.behavioral.strategy;

import org.example.behavioral.strategy.models.Order;
import org.example.behavioral.strategy.strategies.PayStrategy;

public class PaymentContext {
    private PayStrategy payStrategy;



    public PaymentContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public boolean executeStrategy(Order order){
        return this.payStrategy.pay(order);
    }
}
