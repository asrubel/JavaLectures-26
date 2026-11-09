package com.khai.dict._10_generics.intro;

import java.time.LocalDate;

public class Container {
    private Cake firstCake;
    private Cake secondCake;
    private LocalDate firstInsertionDate;
    private LocalDate secondInsertionDate;

    public Container(Cake firstCake, Cake secondCake) {
        this.firstCake = firstCake;
        this.secondCake = secondCake;
        this.firstInsertionDate = LocalDate.now();
        this.secondInsertionDate = LocalDate.now();
    }

    public Cake getFirstCake() {
        return firstCake;
    }

    public Cake getSecondCake() {
        return secondCake;
    }

    public void updateFirst(Cake newCake) {
        firstCake = newCake;
        firstInsertionDate = LocalDate.now();
    }

    public void updateSecond(Cake newCake) {
        secondCake = newCake;
        secondInsertionDate = LocalDate.now();
    }

    public void print() {
        if (firstCake != null) {
            System.out.println(firstCake);
        } else {
            System.out.println("First is empty");
        }

        if (secondCake != null) {
            System.out.println(secondCake);
        } else {
            System.out.println("Second is empty");
        }
    }
}
