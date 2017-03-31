package com.luxoft.labyrinth;

import com.luxoft.labyrinth.cells.*;
import com.luxoft.labyrinth.cells.Wall;
import com.luxoft.labyrinth.cells.Space;
import com.luxoft.labyrinth.cells.Finish;
/**
 * Created by grey5 on 3/27/2017.
 y
 O----------O
 |.#..#.....|
 |.##.###...|
 |......#...|
 |####..#.#.|
 |...#..#.#.|
 |.#.#..###.|
 |.#.#......|
 |.##.###...|
 |.######...|
 |.##.###...|
 O----------Ox
 */

public class GameField {
    private Minotaur minotaur = new Minotaur();
    public void checkEnergy(Minotaur m){
        if (m.getEnergy() <=0){
            System.out.println("Minotaurus is dead!");
            System.exit(0);}
    }
    private Cell [][] cells = {
            {new Space(), new Wall(),new Space(),new Space(), new Wall(), new Space(),new Space(),new Space(),new Space(),new Space()},
            {new Space(), new Wall(), new Wall(), new Space(),new Wall(),new Wall(),new Wall(), new Space(), new Space(), new Space()},
            {new Space(), new Space(), new Space(), new Space(),new Space(),new Aid(),new Wall(), new Space(), new Space(), new Space()},
            {new Wall(), new Wall(), new Wall(), new Wall(),new Bomb(),new Space(),new Wall(), new Space(), new Wall(), new Space()},
            {new Space(), new Space(), new Space(), new Wall(),new Space(),new Space(),new Wall(), new Space(), new Wall(), new Space()},
            {new Space(), new Wall(), new Space(), new Wall(),new Space(),new Space(),new Wall(), new Wall(), new Finish(), new Space()},
            {new Space(), new Wall(), new Space(), new Wall(),new Space(),new Space(),new Space(), new Space(), new Space(), new Space()},
            {new Space(), new Wall(), new Wall(), new Space(),new Wall(),new Wall(),new Wall(), new Space(), new Space(), new Space()},
            {new Space(), new Wall(), new Wall(), new Wall(),new Wall(),new Wall(),new Wall(), new Space(), new Space(), new Space()},
            {new Space(), new Wall(), new Wall(), new Space(),new Wall(),new Wall(),new Wall(), new Space(), new Space(), new Space()},

    };

    public void moveMinotaur(Direction d){
        //define minot position
        int minotY = minotaur.getY();
        int minotX = minotaur.getX();

        switch (d){
            case D:
                minotY = minotY + 1;
                break;
            case U:
                minotY = minotY + 1;
                break;
            case L:
                minotX = minotX - 1;
                break;
            case R:
                minotX = minotX +1;
                break;
            default:
                System.out.println("Unknown command");

        }

        if(minotX <0 || minotX >= cells[0].length || minotY <0 || minotY >= cells.length){
            return;
        }

        boolean ableToMove = cells[minotX][minotY].enter(minotaur);

        if(ableToMove){
            minotaur.setX(minotX);
            minotaur.setY(minotY);
        }



    }

    public void moveMinotaurRight(){
        int minotY = minotaur.getY();
        int minotX = minotaur.getX();
        this.checkEnergy(minotaur);

        if( minotX+1 < cells[minotY].length-1 && cells[minotY][minotX+1].enter(minotaur) ){
            minotX +=1;
            minotaur.setX(minotX);
        }else{
            System.out.println("Unable to move.");
        }
    }

    public void moveMinotaurLeft(){
        int minotY = minotaur.getY();
        int minotX = minotaur.getX();
        this.checkEnergy(minotaur);

        if( minotX-1 >=0 && cells[minotY][minotX-1].enter(minotaur) ){
            minotX -=1;
            minotaur.setX(minotX);
        }else{
            System.out.println("Unable to move.");
        }
    }

    public void moveMinotaurUp(){
        int minotY = minotaur.getY();
        int minotX = minotaur.getX();
        this.checkEnergy(minotaur);

        if(minotY-1 >=0 && cells[minotY-1][minotX].enter(minotaur)){
            minotY -=1;
            minotaur.setY(minotY);
        }else{
            System.out.println("Unable to move.");
        }
    }

    public void moveMinotaurDown(){
        int minotY = minotaur.getY();
        int minotX = minotaur.getX();
        this.checkEnergy(minotaur);

        if(minotY+1 < cells.length-1 && cells[minotY+1][minotX].enter(minotaur) ){
            minotY +=1;
            minotaur.setY(minotY);
        }else{
            System.out.println("Unable to move.");
        }
    }

    public void printField(){

        System.out.print("O");
        for(int i =0; i<cells[1].length-1; i++){System.out.print("-");}
        System.out.println("O");

        for (int j =0; j< cells.length-1; j++){
            System.out.print("|");
            for (int k =0; k<cells[k].length-1; k++){
                if(minotaur.getY() == j && minotaur.getX() ==k){
                    System.out.print(minotaur.getSign());
                }else{
                System.out.print(cells[j][k].getSign());
                }
            }
            System.out.println("|");
        }
        System.out.print("O");
        for(int i =0; i<cells[1].length-1; i++){System.out.print("-");}
        System.out.println("O");
        System.out.println("Minotaur energy is "+minotaur.getEnergy());
    }


}
