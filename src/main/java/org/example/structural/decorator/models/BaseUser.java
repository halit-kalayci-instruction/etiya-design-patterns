package org.example.structural.decorator.models;

public class BaseUser implements User{
    @Override
    public String getPermissions() {
        return "User Permissions";
    }

    @Override
    public String getUserName() {
        return "username";
    }
}
