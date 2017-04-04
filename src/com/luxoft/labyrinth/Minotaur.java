package com.luxoft.labyrinth;

/**
 * Created by grey5 on 3/28/2017.
 */
public class Minotaur {
    int x;
    int y;
    int energy = 20;

    boolean sitting = false;

    private char sign = 'X';

    public int getEnergy() {
        return energy;
    }

    public boolean isSitting(){return sitting;}

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void sitDown() throws IllegalStateException {
        if(!sitting){
            this.sitting = true;
            this.sign = 'x';
        }else{throw  new IllegalStateException("Minotaur is sitting");}
    }

    public void standUp() throws IllegalStateException {
        if(sitting){
            this.sitting = false;
            this.sign = 'R';
        }else{throw  new IllegalStateException("Minotaur is sitting");}
    }

    public char getSign() { return sign; }

    //public void setSign(char c){this.sign = c;}

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
