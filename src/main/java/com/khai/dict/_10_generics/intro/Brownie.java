package com.khai.dict._10_generics.intro;

public class Brownie extends Cake {

    public Brownie(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return "I am a " + type + " brownie.";
    }
}
