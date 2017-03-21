package com.luxoft.zoo;

/**
 * Created by grey5 on 3/21/2017.
 */
public abstract class Zoon {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void produceSound();

    public abstract void eat();
}
