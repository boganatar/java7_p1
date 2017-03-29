package com.luxoft.labyrinth.cells;

import com.luxoft.labyrinth.Minotaur;

/**
 * Created by grey5 on 3/27/2017.
 */
public abstract class Cell {
    protected char sign;
    boolean isVsible = false;

    public boolean getVsible() {
        return isVsible;
    }

    public void setVsible(boolean vsible) {
        isVsible = vsible;
    }

    public char getSign() {
        return sign;
    }

    public abstract boolean enter (Minotaur m);
}
