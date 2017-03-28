package com.luxoft.labyrinth.cells;

import com.luxoft.labyrinth.Minotaur;

/**
 * Created by grey5 on 3/27/2017.
 */
public class Wall extends Cell {
    public Wall(){
        this.sign = '#';
    }
    public boolean enter(Minotaur m){return false;}
}
