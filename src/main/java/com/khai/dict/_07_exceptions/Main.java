package com.khai.dict._07_exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        readFileExample();

        arithmeticExceptionExample();

        numberFormatExceptionExample();

        tryCatchExample();
    }

    public static void readFileExample() throws IOException {
        File file = new File("my.txt");
        System.out.println("Does file exist: " + file.exists());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());

        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();

        System.out.println(readFileAsString(file.getName()));
    }

    private static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void arithmeticExceptionExample() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("Division by zero!");
        } else {
            System.out.println(num1 / num2);
        }

        // System.out.println(num1 / num2);
    }

    public static void numberFormatExceptionExample() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        // "\\d+"
        if (userInput.matches("[0-9]+")) {
            int num = Integer.parseInt(userInput);
            System.out.println(num - 1);
        } else {
            System.out.println("Incorrect input: " + userInput);
        }

        /*int num = Integer.parseInt(userInput);
        System.out.println(num - 1);*/
    }

    public static void tryCatchExample() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        try {
            System.out.println("Try block");
            int num = Integer.parseInt(userInput);
            if (num > 100) {
                System.out.println("Too high value: " + num);
                throw new TooHighValueException("Too high value: " + num);
            }
            System.out.println(num / (num - 1));
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input: " + userInput);
        } catch (ArithmeticException e) {
            System.out.println("Div by zero: " + e.getMessage());
        } catch (TooHighValueException e) {
            System.out.println("My exception message -> " + e.getMessage());
        } finally {
            System.out.println("Finally block");
            sc.close();
        }
    }
}
