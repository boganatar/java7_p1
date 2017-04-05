package com.luxoft.labyrinth;

import com.luxoft.MinotaurStateException;
import com.luxoft.labyrinth.cells.Cell;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by grey5 on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameField gf = new GameField();
        ArrayList<ArrayList<Cell>> cells = new ArrayList<>();
        //[i] ->.get(i);
        gf.printField();
        while (true) {
            String command = scanner.next();
            try {
                switch (command) {
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
                    case "sit":
                        gf.sitMinotaur();
                        gf.printField();
                        break;
                    case "stand":
                        gf.standMinotaur();
                        gf.printField();
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                }
            } catch (MinotaurStateException e) {
                System.out.println("Illegal command for current minotaur state.");
            }
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

