package org.example.structural.bridge;

import org.example.structural.bridge.helpers.EmailSender;
import org.example.structural.bridge.helpers.SmsSender;
import org.example.structural.bridge.messages.EmailMessage;
import org.example.structural.bridge.messages.Message;
import org.example.structural.bridge.messages.SmsMessage;

public class Main {
    public static void main(String[] args) {
        Message message = new SmsMessage(new SmsSender());
        message.send("Merhaba");

        Message message1 = new EmailMessage(new EmailSender());
        message1.send("Selam");
    }
}
