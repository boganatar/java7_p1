package com.company;

/**
 * Created by grey5 on 3/20/2017.
 * a5bcd16*_15abc => aabbccdd*_aabbcc
 * убрать из текста все коментарии - строки начинающиеся с // и /* * *  /
 */
public class Transponer {

    private int aaa;

    public int getAaa() {
        return aaa;
    }

    public void setAaa(int aaa) {
        this.aaa = aaa;
    }

    public int [] revertArr(int [] arr){
        int [] resArr = new int [ arr.length];
        int idx = 0;
        for (int i = arr.length -1; i>= 0; i--){
            resArr[idx] = arr[i];
            idx++;
        }
        return resArr;

    }
    public void printArray2(int [] arr){
        for (int a:arr) {
            System.out.println(a);
        }
    }

    public int [][] transpose(int [][] srcArr){
        System.out.println(srcArr[0].length);
        System.out.println(srcArr.length);
        int [][] resArr = new int [srcArr.length][srcArr[0].length];

        for (int i = 0; i <srcArr.length-1; i++){
            for(int j = 0; j<srcArr[i].length-1; j++){
                resArr[i][j] = srcArr[j][i];
            }

        }
        return resArr;
    }

    public void printArray(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }


}



// 01 =01 02 = 11 03 = 21
/*

for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
 */
