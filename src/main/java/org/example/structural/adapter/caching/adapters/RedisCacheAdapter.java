package org.example.structural.adapter.caching.adapters;

import org.example.structural.adapter.caching.CachingBase;
import org.example.structural.adapter.caching.RedisLibrary;

public class RedisCacheAdapter implements CachingBase {
    RedisLibrary redisLibrary = new RedisLibrary<Object>();

    @Override
    public void set(String key, Object object) {
        redisLibrary.set(key,object,5000);
    }

    @Override
    public Object get(String key) {
        return null;
    }

    @Override
    public void remove(String key) {

    }
}
