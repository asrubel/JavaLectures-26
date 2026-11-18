package com.khai.dict._12_multithreading;

public class Counter {
    private int value = 0;

    public void increment() {
        for (long i = 0; i < 10_000_000L; i++) {
            value++;
        }
    }

    public int getValue() {
        return value;
    }
}
