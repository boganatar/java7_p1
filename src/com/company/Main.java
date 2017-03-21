package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [] arr = {1,2,3};
        int [][] arr2 = {{1,2,3,4},{15,16,23,45},{24,46,85,100}};
        Transponer t  = new Transponer();
        //int [] arr2 = t.revertArr(arr);
        //t.printArray2(arr2);
        int [][] arr3 = t.transpose(arr2);
        t.printArray(arr3);

    }
}
