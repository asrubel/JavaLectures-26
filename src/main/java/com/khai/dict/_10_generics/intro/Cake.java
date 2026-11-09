package com.khai.dict._10_generics.intro;

public class Cake {
    protected String type;

    public Cake(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cake(" + type + ")";
    }
}
