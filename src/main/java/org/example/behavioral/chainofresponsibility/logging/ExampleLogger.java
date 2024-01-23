package org.example.behavioral.chainofresponsibility.logging;

public class ExampleLogger extends AbstractLogger{
    @Override
    void log(String message) {
        System.out.println("Example'a loglandı: " + message);
    }
}
