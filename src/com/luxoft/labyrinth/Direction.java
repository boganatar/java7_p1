package com.luxoft.labyrinth;

/**
 * Created by grey5 on 3/30/2017.
 */
public enum Direction{
    D(0,1), U(0,-1), R(1,0), L(-1,0);
    private int dx;
    private int dy;
    Direction (int dx, int dy){
        this.dx = dx;
        this.dy = dy;
        }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }
}
