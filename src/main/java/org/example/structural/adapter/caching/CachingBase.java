package org.example.structural.adapter.caching;

public interface CachingBase {
    void set(String key, Object object);
    Object get(String key);
    void remove(String key);
}
