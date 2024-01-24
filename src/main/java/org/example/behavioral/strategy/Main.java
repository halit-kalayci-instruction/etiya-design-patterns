package org.example.behavioral.strategy;

import org.example.behavioral.strategy.models.Order;
import org.example.behavioral.strategy.strategies.PayStrategy;
import org.example.behavioral.strategy.strategies.PayWithCash;
import org.example.behavioral.strategy.strategies.PayWithCreditCard;
import org.example.behavioral.strategy.strategies.PayWithPayPal;

public class Main {
    public static void main(String[] args) {
        PayStrategy cash = new PayWithCash();
        PayStrategy creditCart = new PayWithCreditCard();
        PayStrategy paypal = new PayWithPayPal();


        Order order = new Order();
        order.setTotalPrice(100);


        PaymentContext paymentContext = new PaymentContext(cash);

        paymentContext.executeStrategy(order);
        paymentContext.setPayStrategy(paypal);
        paymentContext.executeStrategy(order);
    }
}
