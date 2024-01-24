package org.example.behavioral.state.states;

import org.example.behavioral.state.models.Order;

public class ShippedState implements OrderState{
    @Override
    public void next(Order order) {
        order.setOrderState(new DeliveredState());
    }

    @Override
    public void previous(Order order) {
        order.setOrderState(new NewOrderState());
    }

    @Override
    public void printInformation(Order order) {
        System.out.println("Sipariş kargolandı..");
    }
}
