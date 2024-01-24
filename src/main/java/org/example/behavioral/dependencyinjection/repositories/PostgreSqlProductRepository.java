package org.example.behavioral.dependencyinjection.repositories;

public class PostgreSqlProductRepository implements ProductRepository{
    @Override
    public void add() {
        System.out.println("PostgreSQL'E eklendi.");
    }
}
