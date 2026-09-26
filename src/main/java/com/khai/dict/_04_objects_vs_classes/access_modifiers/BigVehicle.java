package com.khai.dict._04_objects_vs_classes.access_modifiers;

import com.khai.dict._04_objects_vs_classes.basics.Car;

public class BigVehicle extends Car {

    public BigVehicle(String model, int passengers, double weight, String plateNumber) {
        super(model, passengers, weight, plateNumber);
    }
}
