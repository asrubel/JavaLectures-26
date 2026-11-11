package com.khai.dict._11_multithreading;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(100 / 0);

        considerMainThread();

        newThreadsCreating();

        showThreadsConcurrency();

        makeSleeping();

        useJoinManaging();
    }

    public static void considerMainThread() {
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName());
        System.out.println(thread.getId());
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());
        System.out.println(thread.getPriority());

        thread.setName("My-thread");
        System.out.println(thread.getName());
    }

    public static void newThreadsCreating() {
        Thread thread1 = new CustomThread();
        Thread thread2 = new Thread(new CustomRunnable());
        Thread thread3 = new Thread(() -> {
            System.out.printf("Hello, %s!%n", Thread.currentThread().getName());
        });

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(Thread.currentThread().getName());
    }

    public static void showThreadsConcurrency() {
        Thread thread1 = new CustomThread();
        Thread thread2 = new CustomThread();
        Thread thread3 = new CustomThread();

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Done!");
    }

    public static void makeSleeping() throws InterruptedException {
        System.out.println("Started!");
        Thread.sleep(1000L);
        System.out.println("Finished!");
        TimeUnit.SECONDS.sleep(5L);
        System.out.println("Yet another one!");
    }

    public static void useJoinManaging() throws InterruptedException {
        System.out.println("Main: " + Thread.currentThread().getState());

        Thread thread1 = new CustomThread();
        System.out.println(thread1.getName() + ": " + thread1.getState());
        thread1.start();
        System.out.println(thread1.getName() + ": " + thread1.getState());
        System.out.println("Main: " + Thread.currentThread().getState());

        System.out.println("Something is happening!");
        thread1.join();
        System.out.println(thread1.getName() + ": " + thread1.getState());
        System.out.println("Main: " + Thread.currentThread().getState());
        System.out.println("Do something else!");
    }
}
