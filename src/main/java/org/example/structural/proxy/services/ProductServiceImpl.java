package org.example.structural.proxy.services;

import org.example.structural.proxy.libraries.ExampleService;
import org.example.structural.proxy.proxies.ExampleServiceProxy;

public class ProductServiceImpl implements ProductService{
    private ExampleServiceProxy exampleServiceProxy;

    public ProductServiceImpl(ExampleServiceProxy exampleServiceProxy) {
        this.exampleServiceProxy = exampleServiceProxy;
    }


    @Override
    public int getData(int number)
    {
        return exampleServiceProxy.getData(number);
    }
}
