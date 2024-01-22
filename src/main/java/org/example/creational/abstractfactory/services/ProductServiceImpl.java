package org.example.creational.abstractfactory.services;


import org.example.creational.abstractfactory.caching.CachingBase;
import org.example.creational.abstractfactory.factories.CrossCuttingConcernFactory;
import org.example.creational.abstractfactory.logging.LoggerBase;

public class ProductServiceImpl implements ProductService{

    private final CachingBase cachingBase;
    private final LoggerBase loggerBase;

    public ProductServiceImpl(CrossCuttingConcernFactory factory) {
        this.cachingBase = factory.getCaching();
        this.loggerBase = factory.getLogger();
    }

    @Override
    public void add() {
        cachingBase.cache("ProductService.Add");
        loggerBase.log("ProductService.Add");
    }
}
