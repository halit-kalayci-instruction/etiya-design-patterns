package org.example.structural.proxy;

import org.example.structural.proxy.libraries.ExampleService;
import org.example.structural.proxy.proxies.ExampleServiceProxy;
import org.example.structural.proxy.services.ProductService;
import org.example.structural.proxy.services.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl(new ExampleServiceProxy(new ExampleService()));

        System.out.println(productService.getData(5));
        System.out.println(productService.getData(5));
        System.out.println(productService.getData(6));
    }
}
