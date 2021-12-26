package com.company;

public class Car {

    String make = "Toyota";
    String model = "Land Cruiser";
    int year = 2001;
    String color = "black";
    double price = 4000000;

    //Overriding already exist method
    public String toString(){
        String myString = make + "\n"+ model + "\n" + year;
        return myString;
    }

    void drive(){
        System.out.println("You are driving the car!");
    }

    void brake(){
        System.out.println("You stepped into breakes!");
    }
}
