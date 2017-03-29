package com.luxoft.labyrinth.cells;

import com.luxoft.labyrinth.Minotaur;

/**
 * Created by grey5 on 3/29/2017.
 */
public class Bomb extends Cell {
    boolean visited = false;
    public Bomb(){
        if(this.getVsible() ) {
            this.sign = 'b';
        }else{
            this.sign = ' ';
        }
    }

    public boolean enter(Minotaur m){
        if(!visited){
            m.setEnergy(m.getEnergy() - 10);
            this.visited = true;
        }
        return true;}
}
