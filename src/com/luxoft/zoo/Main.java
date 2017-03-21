package com.luxoft.zoo;

/**
 * Created by grey5 on 3/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        Duck donald = new Duck();
        donald.eat();
        donald.produceSound();
        donald.takeOff();
        donald.fly();
        donald.land();
        donald.setAge(5);
        int dAge = donald.getAge();
        donald.setName("Donald");
        String dName = donald.getName();
        System.out.println("Donald age "+dAge);
        System.out.println("Duck name is "+dName);
    }
}
