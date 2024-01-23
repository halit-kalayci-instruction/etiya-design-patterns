package org.example.structural.facade2.facades;

import org.example.structural.facade2.logging.LoggingBase;
import org.example.structural.facade2.services.CustomerService;
import org.example.structural.facade2.services.OrderService;
import org.example.structural.facade2.services.PaymentService;

// @Service
public class ShoppingFacade {
    private CustomerService customerService;
    private OrderService orderService;
    private PaymentService paymentService;

    private LoggingBase loggingBase;

    public void completeOrder(int customerId)
    {
        // ..
        customerService.getCustomer(customerId);
        orderService.createOrder();
        paymentService.makePayment();
        loggingBase.log("Sipariş oluşturuldu..");
    }
}
