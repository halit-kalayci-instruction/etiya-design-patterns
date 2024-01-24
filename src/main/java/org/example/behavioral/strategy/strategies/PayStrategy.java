package org.example.behavioral.strategy.strategies;

import org.example.behavioral.strategy.models.Order;

public interface PayStrategy {
    boolean pay(Order order);
}
