package org.example.behavioral.chainofresponsibility.logging;

public class FileLogger extends AbstractLogger{
    @Override
    void log(String message) {
        System.out.println("File'a loglandı: " + message);
    }
}
