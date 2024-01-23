package org.example.structural.facade2.controllers;

import org.example.structural.facade2.facades.ShoppingFacade;

public class OrdersController {
    private ShoppingFacade shoppingFacade;

    public void createOrder() {
        shoppingFacade.completeOrder(1);
    }
}
