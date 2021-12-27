package com.company;

public class Dog extends Animal {

    //This is a good practice to put override it doesn't do anything but user can get an idea that is overrided from another class
    @Override
    void speak(){
        System.out.println("The dog barks!");
    }

}
