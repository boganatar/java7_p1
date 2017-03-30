package com.luxoft.labyrinth.cells;

import com.luxoft.labyrinth.Minotaur;

/**
 * Created by grey5 on 3/29/2017.
 */
public class Finish extends Cell {
    public Finish(){
        this.sign = '*';
    }

    public boolean enter(Minotaur m){
        m.setEnergy(m.getEnergy() - 1);
        System.out.println("You found the exit.");
        System.exit(0);
        return true;
    }
}
