package com.khai.dict._04_objects_vs_classes.basics;

public class SportCar extends Car {
    public SportCar(String model, int passengers, double weight, String plateNumber) {
        super(model, passengers, weight, plateNumber);
    }

    public void driveFast() {
        System.out.println("Driving fast");
        System.out.println("Plate number: " + plateNumber);
    }
}
