package com.luxoft.labyrinth.cells;

import com.luxoft.MinotaurStateException;
import com.luxoft.labyrinth.Minotaur;

/**
 * Created by grey5 on 3/29/2017.
 */
public class Bomb extends Cell {
    boolean visited = false;
    public Bomb(){
        this.sign = 'b';
    }

    public boolean enter(Minotaur m){
        if(!visited){
            m.setEnergy(m.getEnergy() - 10);
            try {
                m.sitDown();
            }catch (MinotaurStateException e){System.out.println("Illegal command for current minotaur state.");}
            this.visited = true;
        }
        return true;}
}
