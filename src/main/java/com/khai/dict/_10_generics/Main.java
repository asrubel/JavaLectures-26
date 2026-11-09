package com.khai.dict._10_generics;

import com.khai.dict._10_generics.intro.*;

public class Main {
    public static void main(String[] args) {
        introduceGenerics();
    }

    public static void introduceGenerics() {
        Container container = new Container(new Brownie("Chocolate"), new Cake("Cheese"));
        container.print();
        Cake first = container.getFirstCake();
        Cake second = container.getSecondCake();
        System.out.println(first);
        System.out.println(second);

        ObjectContainer objectContainer = new ObjectContainer(new Brownie("Chocolate"), new Chair("Small"));
        objectContainer.print();
        Object firstObj = objectContainer.getFirstObject();
        System.out.println(firstObj);
        if (objectContainer.getFirstObject() instanceof Chair) {
            Chair secondObj = (Chair) objectContainer.getSecondObject();
            String material = secondObj.material;
            System.out.println(secondObj);
        }

        GenericContainer<Chair, Cake> genericContainer = new GenericContainer<>(new Chair("Small"), new Cake("Cheese"));
        genericContainer.print();
        Chair chair = genericContainer.getFirstObject();
        Cake cake = genericContainer.getSecondObject();
    }
}
