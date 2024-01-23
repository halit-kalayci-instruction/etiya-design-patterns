package org.example.behavioral.chainofresponsibility2.handlers;

import org.example.behavioral.chainofresponsibility2.models.Order;

public class PaymentHandler implements OrderHandler {
    OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void process(Order order) {
        if(order.price < 200)
        {
            System.out.println("Ödeme aşaması başarılı!");
            if(nextHandler!=null)
                nextHandler.process(order);
        }
        else
            throw new RuntimeException("Ödeme başarısız!");
    }
}
