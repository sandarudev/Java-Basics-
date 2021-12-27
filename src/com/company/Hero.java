package com.company;

public class Hero extends Person{

    String power;

    //Here name,age declared in the superclass and we are passing that values to superclass using super keyword
    Hero(String name, int age, String power){
        super(name,age);
        this.power = power;

    }

    //Here we are accessing super class method and add modifications that is in the child class
    public String toString(){
        return super.toString() + this.power;
    }
}
