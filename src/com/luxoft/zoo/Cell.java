package com.luxoft.zoo;

/**
 * Created by grey5 on 3/22/2017.
 */
public class Cell {
    private Zoon animal;

    public void placeAnimal(Zoon z) {
        if (this.animal == null) {
            this.animal = z;
        } else {
            System.out.println("Cell is busy!");
        }

    }

    public Zoon empty() {
        Zoon z = this.animal;
        this.animal = null;
        return z;
    }

    public String getAnimalName() {
        //String nm = animal.getName();
        if (animal == null) {
            String msg = "Name is null";
            return msg;
        } else {
            return animal.getName();
        }
    }
}
