package com.luxoft.zoo;

/**
 * Created by grey5 on 3/22/2017.
 */
public class ZooGarden {
    private Cell [] cells = new Cell[10];
    private int cCount = 0;

    public void printANames (){
        if (cCount != 0){
            System.out.println("In zoo " + cCount + " cells");

            for (Cell c:cells) {
                if (c != null){
                    String acn = c.getAnimalName();
                    System.out.println(acn);
                }
            }

            /*for (Cell c:cells) {
                String acn = c.getAnimalName();
                if (c.getAnimalName() != null){System.out.println(c.getAnimalName());}else {
                    System.out.println("This cell is emty");
                }
            }*/
        }
        else{
            System.out.println("Zoo is empty!");
        }
    }

    public void addCell(Cell c){
        cells[cCount] = c;
        cCount++;
    }
}
