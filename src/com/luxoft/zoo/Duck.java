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
        System.out.println("I am "+this.getName()+" and I am eating");
    }

    @Override
    public void fly() {
        System.out.println("I am "+this.getName()+" and I am  flying");

    }

    @Override
    public void land() {
        System.out.println("I am  "+this.getName()+" and I am landing");

    }

    @Override
    public void takeOff() {
        System.out.println("I am "+this.getName()+" and I am  taking off");

    }
}
