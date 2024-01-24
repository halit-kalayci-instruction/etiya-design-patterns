package org.example.behavioral.template;

import org.example.behavioral.template.templates.DigitalProductOrder;
import org.example.behavioral.template.templates.OrderProcessTemplate;
import org.example.behavioral.template.templates.PhysicalProductOrder;

public class Main {
    public static void main(String[] args) {
        OrderProcessTemplate physicalProduct = new PhysicalProductOrder();

        OrderProcessTemplate digitalProduct = new DigitalProductOrder();

        physicalProduct.process();

        digitalProduct.process();
    }
}
