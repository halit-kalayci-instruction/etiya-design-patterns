package org.example.structural.decorator;

import org.example.structural.decorator.decorators.PremiumUserDecorator;
import org.example.structural.decorator.models.BaseUser;
import org.example.structural.decorator.models.User;

public class Main {
    public static void main(String[] args) {
        User baseUser = new BaseUser();
        System.out.println("Permissions for base user: " + baseUser.getPermissions());

        User premiumUser = new PremiumUserDecorator(new BaseUser());
        System.out.println("Permissions for premium user: " + premiumUser.getPermissions());
    }
}
