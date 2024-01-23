package org.example.structural.facade.services;

import org.example.structural.facade.authorization.AuthBase;
import org.example.structural.facade.caching.CachingBase;
import org.example.structural.facade.facades.ProductServiceFacade;
import org.example.structural.facade.logging.LoggingBase;
import org.example.structural.facade.repositories.ProductRepository;

public class ProductServiceImpl implements ProductService {
    private ProductServiceFacade productServiceFacade;

    public ProductServiceImpl(ProductServiceFacade productServiceFacade) {
        this.productServiceFacade = productServiceFacade;
    }

    public void add() {
    }
}
// 11.00