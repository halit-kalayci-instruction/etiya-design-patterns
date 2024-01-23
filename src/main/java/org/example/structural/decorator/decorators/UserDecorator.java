package org.example.structural.decorator.decorators;

import org.example.structural.decorator.models.User;

public abstract class UserDecorator implements User
{
    protected User decoratedUser;

    public UserDecorator(User decoratedUser) {
        this.decoratedUser = decoratedUser;
    }

    @Override
    public String getPermissions() {
        return decoratedUser.getPermissions();
    }

    @Override
    public String getUserName() {
        return decoratedUser.getUserName();
    }
}
