package com.khai.dict._10_generics.intro;

import java.time.LocalDate;

public class GenericContainer<T, E> {
    private T firstObject;
    private E secondObject;
    private LocalDate firstInsertionDate;
    private LocalDate secondInsertionDate;

    public GenericContainer(T firstObject, E secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
        this.firstInsertionDate = LocalDate.now();
        this.secondInsertionDate = LocalDate.now();
    }

    public T getFirstObject() {
        return firstObject;
    }

    public E getSecondObject() {
        return secondObject;
    }

    public void updateFirst(T newObject) {
        firstObject = newObject;
        firstInsertionDate = LocalDate.now();
    }

    public void updateSecond(E newObject) {
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


