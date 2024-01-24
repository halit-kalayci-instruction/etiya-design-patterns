package org.example.behavioral.mediator.models;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void receiveMessage(String msg) {
        System.out.println("Mesaj geldi: " + msg);
    }

}
