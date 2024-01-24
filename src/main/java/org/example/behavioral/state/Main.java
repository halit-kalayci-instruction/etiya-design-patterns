package org.example.behavioral.state;

import org.example.behavioral.state.models.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.printInformation();
        order.next();
        order.printInformation();
        order.next();
        order.printInformation();
    }
}
