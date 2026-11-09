package com.khai.dict._10_generics;

public class KeyAndValue<K, V>  {
    private final K key;
    private final V value;

    public KeyAndValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
