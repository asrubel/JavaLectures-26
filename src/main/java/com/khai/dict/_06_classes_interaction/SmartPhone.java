package com.khai.dict._06_classes_interaction;

public class SmartPhone extends Mobile {
    private final Laptop laptop;

    SmartPhone(Laptop laptop) {
        this.laptop = laptop;
    }

    void sendDataToLaptop(String data) {
        notify(data);
        laptop.receiveInfo(data);
    }
}
