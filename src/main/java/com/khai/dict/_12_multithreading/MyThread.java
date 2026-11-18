package com.khai.dict._12_multithreading;

public class MyThread extends Thread {
    private final Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
    }
}
