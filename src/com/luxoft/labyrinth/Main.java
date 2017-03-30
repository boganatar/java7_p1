package com.luxoft.labyrinth;

import java.util.Scanner;

/**
 * Created by grey5 on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameField gf = new GameField();
        gf.printField();
        while (true){
            String command  = scanner.next();
            switch (command){
                case "right":
                case "r":
                    //gf.moveMinotaurRight();
                    gf.moveMinotaur(Direction.R);
                    gf.printField();
                    break;

                case "left":
                case "l":
                    //gf.moveMinotaurLeft();
                    gf.moveMinotaur(Direction.L);
                    gf.printField();
                    break;

                case "up":
                case "u":
                    //gf.moveMinotaurUp();
                    gf.moveMinotaur(Direction.U);
                    gf.printField();
                    break;

                case "down":
                case "d":
                    //gf.moveMinotaurDown();
                    gf.moveMinotaur(Direction.D);
                    gf.printField();
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }

    //gf.printField();
    //gf.moveMinotaurRight();
    //gf.printField();
    //gf.moveMinotaurDown();
    //gf.printField();
    //gf.moveMinotaurUp();
    //gf.printField();
    //gf.moveMinotaurUp();
    //gf.printField();
     //gf.moveMinotaurLeft();
        //gf.printField();
    }
}
