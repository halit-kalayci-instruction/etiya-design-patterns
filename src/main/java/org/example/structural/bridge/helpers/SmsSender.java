package org.example.structural.bridge.helpers;

public class SmsSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS ile gönderildi: " + message);
    }
}
