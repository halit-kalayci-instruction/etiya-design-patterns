package org.example.behavioral.nullobject;

import org.example.behavioral.nullobject.logging.FileLogger;
import org.example.behavioral.nullobject.services.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService(new FileLogger());
        productService.add();
        productService.delete();
        productService.update();
    }
}
