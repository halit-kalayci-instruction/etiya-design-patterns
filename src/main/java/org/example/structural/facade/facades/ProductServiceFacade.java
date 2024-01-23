package org.example.structural.facade.facades;

import org.example.structural.facade.authorization.AuthBase;
import org.example.structural.facade.caching.CachingBase;
import org.example.structural.facade.logging.LoggingBase;
import org.example.structural.facade.repositories.ProductRepository;

public class ProductServiceFacade {
    private AuthBase authBase;
    private CachingBase cachingBase;
    private LoggingBase loggingBase;
    private ProductRepository productRepository;

    public AuthBase getAuthBase() {
        return authBase;
    }

    public CachingBase getCachingBase() {
        return cachingBase;
    }

    public LoggingBase getLoggingBase() {
        return loggingBase;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }
}
