package org.example.behavioral.chainofresponsibility2.handlers;

import org.example.behavioral.chainofresponsibility2.models.Order;

public interface OrderHandler {
    void setNextHandler(OrderHandler nextHandler);
    void process(Order order);
}
