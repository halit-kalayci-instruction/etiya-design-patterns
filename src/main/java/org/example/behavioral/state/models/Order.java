package org.example.behavioral.state.models;

import org.example.behavioral.state.states.NewOrderState;
import org.example.behavioral.state.states.OrderState;

public class Order {
    private OrderState orderState;
    private int totalPrice;

    public Order() {
        this.orderState = new NewOrderState();
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void printInformation() {
        orderState.printInformation(this);
    }

    public void next() {
        this.orderState.next(this);
    }

    public void previous() {
        this.orderState.previous(this);
    }
}
