package org.example.behavioral.nullobject.services;

import org.example.behavioral.nullobject.logging.BaseLogger;


public class ProductService {
    private BaseLogger baseLogger;
    public ProductService(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add() {
         baseLogger.log("add");
    }
    public void update() {
         baseLogger.log("update");
    }
    public void delete() {
         baseLogger.log("delete");
    }
}
