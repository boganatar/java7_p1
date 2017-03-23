package com.luxoft.zoo;

/**
 * Created by grey5 on 3/21/2017.
 */
public class Duck extends Zoon implements Flyer {

    public Duck(String name){
        super(name);
    }

    public Duck(String name, int age){
        super(name, age);
    }
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
    public void fly(int dest) {
        System.out.println("I am "+this.getName()+" and I am  flying "+dest+"meeters");

    }

    @Override
    public void fly(int dest, int attit) {
        System.out.println("I am  flying "+dest+" meters at attitude "+ attit+"meters");


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
