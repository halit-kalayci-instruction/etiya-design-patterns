package org.example.behavioral.dependencyinjection;

import org.example.behavioral.dependencyinjection.repositories.MongoDbProductRepository;
import org.example.behavioral.dependencyinjection.repositories.PostgreSqlProductRepository;
import org.example.behavioral.dependencyinjection.services.ProductService;
import org.example.behavioral.dependencyinjection.services.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl(new MongoDbProductRepository());
        productService.add();
    }
}
