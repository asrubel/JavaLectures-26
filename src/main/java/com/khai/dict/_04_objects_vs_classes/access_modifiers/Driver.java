package com.khai.dict._04_objects_vs_classes.access_modifiers;

//POJO - Plain Old Java Object
public final class Driver {
    private final String name;
    private final int age;
    private final String category;
    private final int experience;

    public Driver(final String name, final int age,
                  final String category, final int experience) {
        this.name = name;
        this.age = age;
        this.category = category;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCategory() {
        return category;
    }

    public int getExperience() {
        return experience;
    }
}
