package com.khai.dict._05_records_and_interfaces.classes;

import com.khai.dict._05_records_and_interfaces.interfaces.*;

public class Laptop implements USB, WiFi, HDMI {
    @Override
    public void transferData(String data) {
        System.out.println("Transferring data: " + data);
    }

    @Override
    public void charge() {
        System.out.println("Charging...");
    }

    @Override
    public void display() {
        System.out.println("OS loading...");
    }

    @Override
    public void transmitData(String data) {
        System.out.println("Transmitting data: " + data);
    }
}
