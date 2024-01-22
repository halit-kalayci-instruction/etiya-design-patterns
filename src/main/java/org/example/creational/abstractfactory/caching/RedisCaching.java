package org.example.creational.abstractfactory.caching;

public class RedisCaching implements CachingBase{
    @Override
    public void cache(String value) {
        System.out.println("Redis'e cachelendi: " + value);
    }
}
