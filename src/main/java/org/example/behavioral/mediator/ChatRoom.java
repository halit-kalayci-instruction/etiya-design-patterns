package org.example.behavioral.mediator;

import org.example.behavioral.mediator.models.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator
{
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user)
    {
        for (User userToSendMessage: users) {
            if(userToSendMessage != user)
                userToSendMessage.receiveMessage(msg);
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
