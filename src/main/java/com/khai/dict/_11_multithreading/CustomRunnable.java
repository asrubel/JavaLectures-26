package com.khai.dict._11_multithreading;

public class CustomRunnable implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String msg = String.format("Hello, %s!", threadName);
        System.out.println(msg);
    }
}
