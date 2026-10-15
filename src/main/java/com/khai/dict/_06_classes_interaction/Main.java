package com.khai.dict._06_classes_interaction;

public class Main {
    public static void main(String[] args) {
        useStepsCounter();

        useSmartWatches();
    }

    public static void useStepsCounter() {
        StepsCounter stepsCounter = new StepsCounter();
        System.out.println(stepsCounter.getSteps());

        stepsCounter.inc();
        System.out.println(stepsCounter.getSteps());
        stepsCounter.inc(10);
        System.out.println(stepsCounter.getSteps());
        stepsCounter.inc(1000L);
        System.out.println(stepsCounter.getSteps());
        stepsCounter.flush();
        System.out.println(stepsCounter.getSteps());
        System.out.println(stepsCounter);
    }

    public static void useSmartWatches() {
        Laptop laptop = new Laptop();
        SmartWatch smartWatch = new SmartWatch(laptop);
        smartWatch.sendDataToLaptop("Hi!");

        smartWatch.startTraining();
        smartWatch.sendDataToLaptop("How are you?");

        smartWatch.stopTraining();
        smartWatch.sendDataToLaptop("Good job!");

        smartWatch.reset();
        smartWatch.sendDataToLaptop("Reset!");
    }
}
