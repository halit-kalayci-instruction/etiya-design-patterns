package org.example.behavioral.chainofresponsibility.patterns;

import org.example.behavioral.chainofresponsibility.logging.AbstractLogger;
import org.example.behavioral.chainofresponsibility.logging.DatabaseLogger;
import org.example.behavioral.chainofresponsibility.logging.ExampleLogger;
import org.example.behavioral.chainofresponsibility.logging.FileLogger;

public class LoggingChainPattern {
    public static AbstractLogger getLoggerChain(){
        AbstractLogger databaseLogger = new DatabaseLogger();
        AbstractLogger fileLogger = new FileLogger();
        AbstractLogger exampleLogger = new ExampleLogger();

        databaseLogger.setNextChain(fileLogger);
        fileLogger.setNextChain(exampleLogger);

        return databaseLogger;
    }
}
