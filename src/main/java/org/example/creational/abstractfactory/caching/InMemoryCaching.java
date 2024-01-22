package org.example.creational.abstractfactory.caching;

public class InMemoryCaching implements CachingBase{
    @Override
    public void cache(String value) {
        System.out.println("InMemory cachelendi: " + value);
    }
}
