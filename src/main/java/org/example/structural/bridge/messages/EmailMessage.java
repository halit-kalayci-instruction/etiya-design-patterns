package org.example.structural.bridge.messages;

import org.example.structural.bridge.helpers.MessageSender;

public class EmailMessage extends Message{

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        messageSender.sendMessage(message);
    }
}
