package com.khai.dict._12_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        concurrencyExample();

        synchronizedExample();

        executorsExample();
    }

    public static void concurrencyExample() throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new MyThread(counter);
        Thread thread2 = new MyThread(counter);

        thread1.start();
        System.out.println(counter.getValue());
        thread1.join();
        System.out.println(counter.getValue());

        thread2.start();
        System.out.println(counter.getValue());
        thread2.join();
        System.out.println(counter.getValue());
    }

    public static void synchronizedExample() throws InterruptedException {
        MyClass instance1 = new MyClass("instance1");
        MyClass instance2 = new MyClass("instance2");

        Thread thread1 = new SomeThread(instance1);
        Thread thread2 = new SomeThread(instance1);
        Thread thread3 = new SomeThread(instance2);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static void executorsExample() throws InterruptedException {
        final int POOL_SIZE = 4;
        final int NUMBER_OF_TASKS = 10;

        ExecutorService executorService = Executors.newFixedThreadPool(POOL_SIZE);
        executorService.submit(() -> System.out.println("Thread started."));
        executorService.shutdown();

        boolean terminated = executorService.awaitTermination(1, TimeUnit.SECONDS);
        if (!terminated) {
            System.out.println("ExecutorService did not terminate.");
        } else {
            System.out.println("ExecutorService terminated.");
        }

        ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
        for (int i = 0; i < NUMBER_OF_TASKS; i++) {
            int taskNumber = i;
            executor.execute(() -> {
                String taskName = "task-" + taskNumber;
                String threadName = Thread.currentThread().getName();
                System.out.printf("%s executed in %s\n", taskName, threadName);
            });
        }
        executor.shutdown();
    }
}
