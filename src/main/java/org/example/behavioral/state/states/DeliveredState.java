package org.example.behavioral.state.states;

import org.example.behavioral.state.models.Order;

public class DeliveredState implements OrderState{
    @Override
    public void next(Order order) {
        System.out.println("Son aşama.");
    }

    @Override
    public void previous(Order order) {
        order.setOrderState(new ShippedState());
    }

    @Override
    public void printInformation(Order order) {
        System.out.println("Sipariş teslim edildi..");
    }
}
