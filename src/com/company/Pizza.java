package com.company;

// Here we have use the cocept called constructor overloading and we can output different answers according to what user enetered!
public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;

    }

    Pizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;

    }

    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }
}
