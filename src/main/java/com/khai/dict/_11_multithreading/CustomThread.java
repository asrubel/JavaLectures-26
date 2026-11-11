package com.khai.dict._11_multithreading;

public class CustomThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String msg = String.format("Hello, %s!", getName());
        System.out.println(msg);
    }
}
