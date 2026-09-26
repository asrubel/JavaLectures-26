package com.khai.dict._04_objects_vs_classes.basics;

public class Car {
    public String model;
    String plateNumber;
    protected int passengers;
    private double weight;

    public Car(String model, int passengers, double weight, String plateNumber) {
        this.model = model;
        this.passengers = passengers;
        this.weight = weight;
        this.plateNumber = plateNumber;
    }

    public void drive() {
        System.out.println("Drive car");
    }
}
