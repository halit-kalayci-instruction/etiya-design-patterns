package org.example.structural.adapter.caching;

// outsource - mvn dependency
public class RedisLibrary<T> {
    public static void get(String key, String collection)
    {
        //return T;
    }

    public void set(String key, T object, int lifeTime)
    {
        //...
    }
}
