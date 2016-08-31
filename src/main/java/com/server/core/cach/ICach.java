package com.server.core.cach;

/**
 * 
 * @author nullzZ
 *
 */
public interface ICach<K, T> {
    public T get(K key);

    public boolean check(K key);

    public T put(K key, T t);
}
