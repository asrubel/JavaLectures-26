package com.khai.dict._10_generics.intro;

import java.time.LocalDate;

public class ObjectContainer {
    private Object firstObject;
    private Object secondObject;
    private LocalDate firstInsertionDate;
    private LocalDate secondInsertionDate;

    public ObjectContainer(Object firstObject, Object secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
        this.firstInsertionDate = LocalDate.now();
        this.secondInsertionDate = LocalDate.now();
    }

    public Object getFirstObject() {
        return firstObject;
    }

    public Object getSecondObject() {
        return secondObject;
    }

    public void updateFirst(Object newObject) {
        firstObject = newObject;
        firstInsertionDate = LocalDate.now();
    }

    public void updateSecond(Object newObject) {
        secondObject = newObject;
        secondInsertionDate = LocalDate.now();
    }

    public void print() {
        if (firstObject != null) {
            System.out.println(firstObject);
        } else {
            System.out.println("First is empty");
        }

        if (secondObject != null) {
            System.out.println(secondObject);
        } else {
            System.out.println("Second is empty");
        }
    }
}

