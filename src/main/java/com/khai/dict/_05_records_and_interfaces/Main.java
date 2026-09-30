package com.khai.dict._05_records_and_interfaces;

import com.khai.dict._05_records_and_interfaces.classes.Device;
import com.khai.dict._05_records_and_interfaces.classes.Laptop;
import com.khai.dict._05_records_and_interfaces.classes.SmartPhone;
import com.khai.dict._05_records_and_interfaces.interfaces.Chargeable;
import com.khai.dict._05_records_and_interfaces.interfaces.USB;
import com.khai.dict._05_records_and_interfaces.records.Person;
import com.khai.dict._05_records_and_interfaces.records.Student;

public class Main {
    public static void main(String[] args) {
        //recordExample();

        interfaceImplementationExample();

        //useMultipleInterfaces();
    }

    public static void recordExample() {
        Person person = new Person("Ivan", 20);
        System.out.println(person);
        System.out.println(person.name());
        System.out.println(person.age());

        Student student = new Student(person, "529", 2);
        System.out.println(student);
        System.out.println(student.person());
        System.out.println(student.group());
        System.out.println(student.grade());
    }

    public static void interfaceImplementationExample() {
        Device device1 = new Device("Phone");
        device1.charge();
        device1.transferData();

        Object device2 = new Device("Something");
        System.out.println(device2.hashCode());

        Device device3 = (Device) device2;
        device3.charge();
        device3.transferData();

        Chargeable device4 = new Device("Charger");
        device4.charge();

        Device device5 = (Device) device4;
        device5.charge();
        device5.transferData();
    }

    public static void useMultipleInterfaces() {
        Laptop laptop1 = new Laptop();
        laptop1.charge();
        laptop1.transmitData("Hi!");
        laptop1.transferData("Hello!");
        laptop1.display();
        laptop1.showManufacturer();

        SmartPhone smartPhone1 = new SmartPhone();
        smartPhone1.charge();
        smartPhone1.transmitData("Hi!");
        smartPhone1.transferData("Hello!");

        chargeLaptop(laptop1);
        chargeSmartPhone(smartPhone1);

        chargeDevice(laptop1);
        chargeDevice(smartPhone1);

        sendData(laptop1, "Hi!");
        sendData(smartPhone1, "Hello!");
    }

    private static void chargeLaptop(Laptop laptop) {
        laptop.charge();
    }

    private static void chargeSmartPhone(SmartPhone smartPhone) {
        smartPhone.charge();
    }

    private static void chargeDevice(Chargeable device) {
        device.charge();
    }

    private static void sendData(USB device, String data) {
        device.transferData(data);
    }
}
