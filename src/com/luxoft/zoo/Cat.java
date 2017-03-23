package com.luxoft.zoo;

/**
 * Created by grey5 on 3/22/2017.
 */
public class Cat extends Zoon {
    public String getColor() {
        return color;
    }

    public Cat(String name, String color){

        super(name, 0);

        this.color = color;
        //implict super();
        System.out.println("Cat's constructor. Name: "+ name);
    }

    String color;
    /*public Cat(String name, int age){
        super(name);
        //this.age = age;
        //implict super();
        System.out.println("Cat's constructor. Name: "+ name);
    }*/

    public Cat(String name){
        super(name);
        //implict super();
        System.out.println("Cat's constructor. Name: "+ name);
    }
    @Override
    public void produceSound() {
        System.out.println("Mau");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    public void pur(){
        System.out.println(this.getName()+" pur.... pur...");
    }
}
