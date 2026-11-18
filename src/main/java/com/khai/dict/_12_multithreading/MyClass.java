package com.khai.dict._12_multithreading;

public class MyClass {
    private final String name;

    public MyClass(String name) {
        this.name = name;
    }

    public synchronized void doSomething() {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s entered the method of %s%n", threadName, name);
        System.out.printf("%s left the method of %s%n", threadName, name);
    }

    public void syncInstanceMethod() {
        System.out.println("Start");

        synchronized (this) {
            System.out.println(name);
        }
    }
}
