package org.example.behavioral.mediator;

import org.example.behavioral.mediator.models.User;

public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
