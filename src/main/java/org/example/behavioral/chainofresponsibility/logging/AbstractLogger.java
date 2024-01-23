package org.example.behavioral.chainofresponsibility.logging;

public abstract class AbstractLogger {
    public AbstractLogger nextChain;

    public void setNextChain(AbstractLogger abstractLogger)
    {
        nextChain=abstractLogger;
    }

    public void logMessage(String message) {
        log(message);

        if(nextChain!=null)
        {
            nextChain.logMessage(message);
        }
    }

    abstract void log(String message);
}
