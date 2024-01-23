package org.example.behavioral.chainofresponsibility2;

import org.example.behavioral.chainofresponsibility2.handlers.OrderHandler;
import org.example.behavioral.chainofresponsibility2.models.Order;
import org.example.behavioral.chainofresponsibility2.patterns.OrderChainPattern;

public class Main {
    public static void main(String[] args) {
        // Service
        OrderHandler chain = OrderChainPattern.getOrderChain();

        Order order = new Order();
        order.price=150;
        order.isInStock=true;
        chain.process(order);
    }
}
