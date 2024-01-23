package org.example.structural.adapter.caching;

import java.util.HashMap;

public class InMemoryCaching implements CachingBase{
    private HashMap<String,Object> cache = new HashMap<>();


    @Override
    public void set(String key, Object object) {
        cache.put(key,object);
    }

    @Override
    public Object get(String key) {
        return cache.get(key);
    }

    @Override
    public void remove(String key) {
        cache.remove(key);
    }
}
