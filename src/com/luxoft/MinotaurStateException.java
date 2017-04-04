package com.luxoft;

/**
 * Created by grey5 on 4/4/2017.
 */
public class MinotaurStateException extends Exception {
    private int x;
    private int y;

    public String getMessage(){
        String message =super.getMessage()+"Minotaur exception at X = "+x+"Y ="+y;
        return message;
    }

    public MinotaurStateException(int x, int y, String message){
        super(message);
        this.x = x;
        this.y = y;
        //String message = "Minotaur exception at X = "+x+"Y ="+y;



    }
}
