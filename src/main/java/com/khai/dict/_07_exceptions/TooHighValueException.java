package com.khai.dict._07_exceptions;

public class TooHighValueException extends Exception {
    public TooHighValueException(String message) {
        super(message);
        System.out.println("Inside the TooHighValueException");
    }
}
