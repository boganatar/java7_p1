package com.luxoft.zoo;

/**
 * Created by grey5 on 3/21/2017.
 */
public class Duck extends Zoon implements Flyer {
    @Override
    public void produceSound() {
        System.out.println("krya - krya");
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");

    }

    @Override
    public void land() {
        System.out.println("I am landing");

    }

    @Override
    public void takeOff() {
        System.out.println("I am taking off");

    }
}
