package org.example.behavioral.dependencyinjection.services;

import org.example.behavioral.dependencyinjection.repositories.ProductRepository;

public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void add() {
        productRepository.add();
    }
}
