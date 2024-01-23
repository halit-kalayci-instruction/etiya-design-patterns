package org.example.structural.bridge.messages;

import org.example.structural.bridge.helpers.MessageSender;

public abstract class Message {

    protected MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send(String message);
}
