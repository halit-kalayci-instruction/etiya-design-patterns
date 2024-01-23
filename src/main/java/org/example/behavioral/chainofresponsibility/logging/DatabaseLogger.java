package org.example.behavioral.chainofresponsibility.logging;

public class DatabaseLogger extends AbstractLogger{
    @Override
    void log(String message) {
        System.out.println("Database'e loglandı: " + message);
    }
}
