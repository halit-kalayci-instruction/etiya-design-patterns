package org.example.creational.abstractfactory.logging;

public class DatabaseLogger implements LoggerBase{
    @Override
    public void log(String message) {
        System.out.println("DB'ye loglandı: " + message);
    }
}
