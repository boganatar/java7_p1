package com.luxoft.zoo;

/**
 * Created by grey5 on 3/22/2017.
 */
public class Cell {
    private Zoon animal;
    public void placeAnimal(Zoon z){
        this.animal = z;
    }
    public Zoon empty(){
        Zoon z = this.animal;
        this.animal = null;
        return z;
    }
    public String getAnimalName(){
        //String nm = animal.getName();
        if ( animal == null){
            String msg = "Name is null";
            return msg;}
        else {return animal.getName();}
    }
}
