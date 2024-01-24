package org.example.behavioral.state.states;

import org.example.behavioral.state.models.Order;

public interface OrderState {
    void next(Order order);
    void previous(Order order);
    void printInformation(Order order);
}
