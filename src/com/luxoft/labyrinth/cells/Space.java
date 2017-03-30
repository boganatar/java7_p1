package com.luxoft.labyrinth.cells;

import com.luxoft.labyrinth.Minotaur;

/**
 * Created by grey5 on 3/27/2017.
 */
public class Space extends Cell {
    public Space(){
        this.sign = '.';
    }

    public boolean enter(Minotaur m){
        m.setEnergy(m.getEnergy() - 1);
        return true;}
}
