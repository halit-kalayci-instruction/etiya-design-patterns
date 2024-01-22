package org.example.creational.singleton;


public class DatabaseContext {
    private static DatabaseContext instance;

    private String name;

    private DatabaseContext(String name) {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name = name;
    }

    public void connect() {
        System.out.println("Connected to " + name);
    }

    public static DatabaseContext getInstance(String name) {
        if(instance == null)
            instance = new DatabaseContext(name);
        return instance;
    }
}
