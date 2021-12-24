package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /**
        //16 - 2D Array
        Scanner scanner  = new Scanner(System.in);
        String[][] cars = new String[2][3];
        int i = cars.length;

        //Getting user inputs
        for (int x=0;x<i; x++){
            for (int y=0; y<cars[x].length; y++){
                System.out.println("Enter car models: ");
                cars[x][y]= scanner.next();
                System.out.println("Data Recorded for: " + x + y);
            }
        }
        System.out.println("Car Models Recorded!");
        System.out.println();

         //Printing the output
         for (int x=0;x<i; x++) {
            System.out.println();
            for (int y = 0; y < cars[x].length; y++) {
                System.out.print(cars[x][y]+" ");
            }
        }
    **/
    /**
        //17 - String Methods
        String name = "Test";

        //boolean result = name.equals("Test");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf('s');
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        //String result = name.replace('e','x');

        System.out.println(result);
    **/
    /**
        // 18 - Wrapper Classes (Reference Data Types used in places like ArrayList)
        //When working with primitive and wrapper data types, wrapper data type allow user to access different type of methods while primitive is use to deal with large numbers with ease of time.
        // Autoboxing Wrapper Classes
        Boolean a = true;
        Character b = 'b';
        Integer c = 123;
        Double d = 2.34;
        String e = "Java";

        //Unboxing that wrapper classes in the above example
        if (a == true){
            System.out.println("Boolean is true!");
        }
    **/
    /**
        // 19 - ArrayList
        ArrayList<String> foods = new ArrayList<String>(); //In this line creating reference object with wrapper data type to store reference data lately.

        //Adding values to the defined ArrayList
        foods.add("Pizza");
        foods.add("Burgers");
        foods.add("Lasgna");

        //Function that can be execute to the ArrayList
        foods.set(0,"Margherita");
        foods.remove(1);
        foods.clear();

        //Printout the output of  the ArrayList
        for (int i=0; i<foods.size();i++){
            System.out.println(foods.get(i));
        }
    **/

        //20 - 2D ArrayList





    }
}
