package org.example.behavioral.state.states;

import org.example.behavioral.state.models.Order;

public class NewOrderState implements OrderState{
    @Override
    public void next(Order order) {
        order.setOrderState(new ShippedState());
    }

    @Override
    public void previous(Order order) {
        System.out.println("Zaten 1. state içerisinde.");
    }

    @Override
    public void printInformation(Order order) {
        System.out.println("Sipariş hazırlanıyor..");
    }
}
