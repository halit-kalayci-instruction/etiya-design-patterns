package org.example.structural.bridge.helpers;

public class EmailSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("E-posta ile gönderildi: " + message);
    }
}
