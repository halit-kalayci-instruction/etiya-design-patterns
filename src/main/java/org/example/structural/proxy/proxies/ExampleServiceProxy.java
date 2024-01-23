package org.example.structural.proxy.proxies;

import org.example.structural.proxy.libraries.ExampleService;

import java.util.HashMap;

public class ExampleServiceProxy
{
    private ExampleService exampleService;
    private HashMap<Integer,Integer> cache = new HashMap<>();

    public ExampleServiceProxy(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    public int getData(int number)
    {
        if(cache.containsKey(number))
            return cache.get(number);

        int result = exampleService.getData(number);
        cache.put(number,result);

        return result;
    }
}
