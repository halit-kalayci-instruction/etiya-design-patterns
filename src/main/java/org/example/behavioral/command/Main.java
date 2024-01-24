package org.example.behavioral.command;

import org.example.behavioral.command.commands.CreateOrderCommand;
import org.example.behavioral.command.commands.UpdateOrderCommand;

public class Main {
    public static void main(String[] args) {
        CreateOrderCommand createCommand = new CreateOrderCommand(1);
        createCommand.execute();


        UpdateOrderCommand updateCommand = new UpdateOrderCommand(1,2);
        updateCommand.execute();
    }
}
