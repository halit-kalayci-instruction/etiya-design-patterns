package org.example.behavioral.mediator;

import org.example.behavioral.mediator.models.User;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");
        User user4 = new User("user4");


        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        chatMediator.sendMessage("Merhaba",user1);
    }
}
