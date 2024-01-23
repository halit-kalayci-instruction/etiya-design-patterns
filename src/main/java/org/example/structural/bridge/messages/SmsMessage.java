package org.example.structural.bridge.messages;

import org.example.structural.bridge.helpers.MessageSender;

public class SmsMessage extends Message{
    public SmsMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        messageSender.sendMessage(message);
    }
}
