package com.luxoft.labyrinth;

/**
 * Created by grey5 on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) {
    GameField gf = new GameField();
    gf.printField();
    //gf.moveMinotaurRight();
    //gf.printField();
    gf.moveMinotaurDown();
    gf.printField();
    gf.moveMinotaurUp();
    gf.printField();
    //gf.moveMinotaurUp();
    //gf.printField();
     gf.moveMinotaurLeft();
        //gf.printField();
    }
}
