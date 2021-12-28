package com.company;

public class Fish implements Prey,Predator {
    @Override
    public void hunt() {
        System.out.println("The fish hunt small fish");
    }

    @Override
    public void flee() {
        System.out.println("The fish flee by large fish");
    }
}
