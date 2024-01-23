package org.example.behavioral.chainofresponsibility2.handlers;

import org.example.behavioral.chainofresponsibility2.models.Order;

public class StockHandler implements OrderHandler{
    private OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void process(Order order) {
        if(order.isInStock)
        {
            System.out.println("Stok kontrol mekanizması çalıştı.");
            if(nextHandler!=null)
                nextHandler.process(order);
        }
        else
         throw new RuntimeException("Ürün stokta yok!");
    }
}
