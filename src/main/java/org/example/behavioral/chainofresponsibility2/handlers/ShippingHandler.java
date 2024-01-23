package org.example.behavioral.chainofresponsibility2.handlers;

import org.example.behavioral.chainofresponsibility2.models.Order;

public class ShippingHandler implements OrderHandler{
    OrderHandler nextHandler;
    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void process(Order order) {
        System.out.println("Order için kargo işlemleri başlatıldı..");
        if(nextHandler!=null)
            nextHandler.process(order);
    }
}
