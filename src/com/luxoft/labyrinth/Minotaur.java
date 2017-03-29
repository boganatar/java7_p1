package com.luxoft.labyrinth;

/**
 * Created by grey5 on 3/28/2017.
 */
public class Minotaur {
    int x;
    int y;
    int energy = 20;

    private char sign = 'X';

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public char getSign() {
        return sign;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
