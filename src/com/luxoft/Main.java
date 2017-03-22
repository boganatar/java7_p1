package com.luxoft;

import com.com.luxoft.vehicle.Aircraft;
import com.luxoft.zoo.Cat;
import com.luxoft.zoo.Duck;
import com.luxoft.zoo.Cell;
import com.luxoft.zoo.Flyer;

/**
 * Created by grey5 on 3/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        Duck donald = new Duck();
        donald.setName("Donald");
        donald.setAge(5);

        Duck scrudge = new Duck();
        scrudge.setName("Scrudge");

        donald.eat();
        donald.produceSound();
        donald.takeOff();
        donald.fly();
        donald.land();

        int dAge = donald.getAge();
        String dName = donald.getName();

        System.out.println("Donald age " + dAge);
        System.out.println("Duck name is " + dName);

        Aircraft boeing = new Aircraft();
        boeing.takeOff();
        boeing.fly();
        boeing.land();

        Flyer[] flyers = {scrudge, donald, boeing};

        for (Flyer f : flyers) {
            f.takeOff();
            f.fly();
            f.land();
        }

        Cell cell = new Cell();
        //cell.placeAnimal(donald);
        String acn = cell.getAnimalName();
        System.out.println(acn);
        //cell.empty();

        Cat basya = new Cat();
        basya.setName("Basya");
        basya.pur();
        basya.eat();
        basya.produceSound();

    }
}
