package org.example.structural.adapter.services;

import org.example.structural.adapter.caching.CachingBase;

public class ProductServiceImpl implements ProductService{
    private CachingBase caching;

    // DI Hell, CTOR Hell
    public ProductServiceImpl(CachingBase caching) {
        this.caching = caching;
    }

    @Override
    public void getAll() {
        // ...
        //if(caching.get("products") != null)
            //return caching.get("products");
        caching.set("products", "");
    }
}
