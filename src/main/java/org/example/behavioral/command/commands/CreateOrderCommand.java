package org.example.behavioral.command.commands;

public class CreateOrderCommand implements OrderCommand
{
    private int userId;

    public CreateOrderCommand(int userId) {
        this.userId = userId;
    }

    @Override
    public void execute() {
        //
        System.out.println(userId + " idli user için sipariş oluşturuldu.");
    }
}
