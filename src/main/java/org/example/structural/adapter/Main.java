package org.example.structural.adapter;


import org.example.structural.adapter.caching.InMemoryCaching;
import org.example.structural.adapter.caching.adapters.RedisCacheAdapter;
import org.example.structural.adapter.services.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        ProductServiceImpl productService = new ProductServiceImpl(new RedisCacheAdapter());
    }
}
