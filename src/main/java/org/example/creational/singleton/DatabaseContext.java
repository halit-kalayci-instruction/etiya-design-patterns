package org.example.creational.singleton;


import java.util.Random;

public class DatabaseContext {
    private volatile static DatabaseContext instance;

    private String name;

    private DatabaseContext(String name) {
        try{
            Random random = new Random();

            int randomMs = 1000 + random.nextInt(4001);
            Thread.sleep(randomMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name = name;
    }

    public void connect() {
        System.out.println("Connected to " + name);
    }

    public static DatabaseContext getInstance(String name) {
        // c# - lock
        // java - synchronized
        DatabaseContext context = instance;
        if(context!=null) return context;

        synchronized (DatabaseContext.class)
        {
            if(instance==null)
                instance = new DatabaseContext(name);
            return instance;
        }
    }
}
