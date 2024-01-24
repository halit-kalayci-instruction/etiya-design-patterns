package org.example.behavioral.dependencyinjection.repositories;

public class MongoDbProductRepository implements ProductRepository{
    @Override
    public void add() {
        System.out.println("MongoDB'e eklendi.");
    }
}
