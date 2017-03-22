package com.luxoft.zoo;

/**
 * Created by grey5 on 3/22/2017.
 */
public class Cat extends Zoon {
    @Override
    public void produceSound() {
        System.out.println("Mau");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    public void pur(){
        System.out.println(this.getName()+" pur.... pur...");
    }
}
