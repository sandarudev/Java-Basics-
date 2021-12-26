package com.company;

import java.util.Random;

public class DiceRoller {

    //In order to use that in global mode you can declare it outside the constrcutor and eliminate Random and int declartion in the constrctor
    // Random random;
    // int number

    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll(random,number);

    }

    void roll(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
}
