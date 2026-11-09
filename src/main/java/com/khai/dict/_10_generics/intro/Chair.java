package com.khai.dict._10_generics.intro;

public class Chair {
    protected String type;
    public String material = "Wood";

    public Chair(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chair(" + type + ")";
    }
}
