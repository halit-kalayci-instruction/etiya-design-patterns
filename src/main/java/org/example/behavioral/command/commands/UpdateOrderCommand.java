package org.example.behavioral.command.commands;

public class UpdateOrderCommand implements OrderCommand{
    private int id;
    private int userId;

    public UpdateOrderCommand(int id, int userId) {
        this.id = id;
        this.userId = userId;
    }

    @Override
    public void execute() {
        System.out.println(id + " idli sipariş " + userId + " user id'si ile güncellenmiştir.");
    }
}
