package org.example.behavioral.chainofresponsibility;

import org.example.behavioral.chainofresponsibility.logging.AbstractLogger;
import org.example.behavioral.chainofresponsibility.patterns.LoggingChainPattern;

public class Main {
    public static void main(String[] args) {
        AbstractLogger logger = LoggingChainPattern.getLoggerChain();
        logger.logMessage("Merhaba");
    }
}
