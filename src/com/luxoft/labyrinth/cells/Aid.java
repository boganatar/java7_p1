package com.luxoft.labyrinth.cells;

import com.luxoft.labyrinth.Minotaur;

/**
 * Created by grey5 on 3/29/2017.
 */
public class Aid extends Cell {
    boolean visited = false;
    public Aid(){
        this.sign = '+';
    }

    public boolean enter(Minotaur m){
        if(!visited){
        m.setEnergy(m.getEnergy() + 10);
        this.visited = true;
        }
        return true;}
}
