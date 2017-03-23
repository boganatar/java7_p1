package com.com.luxoft.vehicle;

import com.luxoft.zoo.Flyer;

/**
 * Created by grey5 on 3/21/2017.
 */
public class Aircraft implements Flyer {
    @Override
    public void fly() {
        //System.out.println("I am flying as a plane"+10+" meeters");
        fly(10, 10);

    }

    @Override
    public void fly(int dest) {
        //System.out.println("I am  flying as a plane "+dest+" meters");
        fly(100, 10);

    }

    @Override
    public void fly(int dest, int attit) {
        System.out.println("I am  flying as a plane "+dest+" meters at attitude "+ attit+"meters");


    }

    @Override
    public void land() {
        System.out.println("I am landing as a plane");

    }

    @Override
    public void takeOff() {
        System.out.println("I am taking off as a plane");

    }
}
