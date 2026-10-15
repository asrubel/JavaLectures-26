package com.khai.dict._06_classes_interaction;

import java.util.Random;

public class SmartWatch extends Mobile {
    private final Laptop laptop;
    private final StepsCounter stepsCounter = new StepsCounter();
    private boolean isTraining = false;

    private static final int MIN_HEART_RATE = 60;
    private static final int MAX_HEART_RATE = 200;

    public SmartWatch(Laptop laptop) {
        this.laptop = laptop;
    }

    void startTraining() {
        isTraining = true;
        Random rand = new Random();
        stepsCounter.inc(rand.nextInt(10000));
        System.out.println("SmartWatch training started");
    }

    void stopTraining() {
        isTraining = false;
        System.out.println("SmartWatch training stopped");
    }

    void reset() {
        stepsCounter.flush();
        System.out.println("SmartWatch reset");
    }

    private int estimateHeartRate() {
        int multiplier = isTraining ? MAX_HEART_RATE : MIN_HEART_RATE;
        return (int) (Math.random() * multiplier) + MIN_HEART_RATE;
    }

    void sendDataToLaptop(String data) {
        notify(data);
        laptop.receiveInfo(data +
                ", steps: " + stepsCounter.getSteps() +
                ", is training: " + isTraining +
                ", heart rate: " + estimateHeartRate());
    }
}
