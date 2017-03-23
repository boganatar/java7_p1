package com.luxoft;

import com.com.luxoft.vehicle.Aircraft;
import com.luxoft.zoo.*;

/**
 * Created by grey5 on 3/21/2017.
 * Ctrl+Alt+l
 */
public class Main {
    public static void main(String[] args) {
        Duck donald = new Duck("Donald");
        //donald.setName("Donald");
        //donald.setAge(5);

        Duck scrudge = new Duck("Scrudge");
        //scrudge.setName("Scrudge");

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
        boeing.fly(3);
        boeing.land();

        Flyer[] flyers = {scrudge, donald, boeing};

        for (Flyer f : flyers) {
            f.takeOff();
            f.fly();
            f.land();
        }

        Cell cell = new Cell();
        Cell cell2 = new Cell();
        cell.placeAnimal(donald);
        cell2.placeAnimal(scrudge);

        String acn = cell.getAnimalName();
        System.out.println(acn);
        //cell.empty();

        Cat basya = new Cat("Basya", "Grey");
        //basya.setName("Basya");
        basya.pur();
        basya.eat();
        basya.produceSound();

        ZooGarden zoo = new ZooGarden();
        zoo.addCell(cell);
        zoo.addCell(cell2);
        zoo.printANames();

    }
}
