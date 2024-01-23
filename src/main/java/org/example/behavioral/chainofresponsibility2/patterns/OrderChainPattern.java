package org.example.behavioral.chainofresponsibility2.patterns;

import org.example.behavioral.chainofresponsibility2.handlers.OrderHandler;
import org.example.behavioral.chainofresponsibility2.handlers.PaymentHandler;
import org.example.behavioral.chainofresponsibility2.handlers.ShippingHandler;
import org.example.behavioral.chainofresponsibility2.handlers.StockHandler;

public class OrderChainPattern {
    public static OrderHandler getOrderChain(){
        OrderHandler stockHandler = new StockHandler();
        OrderHandler paymentHandler = new PaymentHandler();
        OrderHandler shippingHandler = new ShippingHandler();
        stockHandler.setNextHandler(paymentHandler);
        paymentHandler.setNextHandler(shippingHandler);
        return stockHandler;
    }
}
