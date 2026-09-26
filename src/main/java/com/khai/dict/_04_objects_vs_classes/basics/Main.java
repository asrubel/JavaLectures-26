package com.khai.dict._04_objects_vs_classes.basics;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4, 5, "1234");
        System.out.println(car.model);
        System.out.println(car.passengers);
        System.out.println(car.plateNumber);
        car.drive();

        SportCar sportCar = new SportCar("Ferrari", 2, 7, "4567");
        System.out.println(sportCar.model);
        System.out.println(sportCar.passengers);
        System.out.println(sportCar.plateNumber);
        sportCar.drive();
        sportCar.driveFast();
    }
}
