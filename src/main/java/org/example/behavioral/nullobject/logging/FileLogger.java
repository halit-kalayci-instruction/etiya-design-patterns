package org.example.behavioral.nullobject.logging;

public class FileLogger implements BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("File'a loglandı: " + message);
    }
}
