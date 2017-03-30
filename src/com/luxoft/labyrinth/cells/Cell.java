package com.luxoft.labyrinth.cells;

import com.luxoft.labyrinth.Minotaur;

/**
 * Created by grey5 on 3/27/2017.
 */
public abstract class Cell {
    protected char sign;

    public char getSign() {
        return sign;
    }

    public abstract boolean enter (Minotaur m);
}
