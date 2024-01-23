package org.example.structural.decorator.decorators;

import org.example.structural.decorator.models.User;

public class PremiumUserDecorator extends UserDecorator{
    public PremiumUserDecorator(User decoratedUser) {
        super(decoratedUser);
    }

    @Override
    public String getPermissions() {
        return decoratedUser.getPermissions() + ", premium permissions";
    }


}
