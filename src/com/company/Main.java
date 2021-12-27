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
    /**
        //20 - 2D ArrayList
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomatoes");
        produceList.add("Zuchchini");
        produceList.add("Peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Soda");
        drinkList.add("Coffee");

        //Adding sub ArrayLists to the main Array in order to make a 2D Array
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(0).get(1));
    **/
    /**
        //21 - for-each loop - traversing technique that use to iterate through the elements in an array/collection with less steps, more readable and more flexible.

        //String[] animals = {"cat","dog","rat"};
        ArrayList<String> animals = new ArrayList();

        animals.add("cat");
        animals.add("giraffee");
        animals.add("rat");

        for (String i : animals){
            System.out.println(i);
        }
    **/
    /**
        //22 - Methods
        //The method is created outside main method of this class file.
        //hello("Sandaru",24);

        int x =12;
        int y = 10;
        System.out.println(add(x,y));
    **/
    /**
        //23 - Overloaded Methods
        int x = add(3,4);
        System.out.println(x);
        double y = add(4.3,2.2);
        System.out.println(y);
    **/

    /**
        //24 - printf
        // You have place a format specifier in order to print something with the printf statement.

        //System.out.printf("%d This is format specifier",123); // user printf beside println

        //Example with some data types(Look at how to use data type and their respective specifiers)


        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;


        System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);


        //Maintaining width of the output
        System.out.printf("Hello %10s",myString);
        //Precision
        System.out.printf("You have this much of %.1f",myDouble);
        //Flags
        // - : left-justify
        // + : output a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You have this much money %,f",myDouble);
    **/

    /**
        //25 - Final keyword - as a practice when developers use final keyword they rename it in uppercase letters

        final double PI = 3.14159;
        System.out.println(PI);
    **/

    /**

        //26 - Object (OOP)
        //Creating object for the class
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        //Accessing object attributes by calling created objects
        System.out.println(myCar1.model);
        System.out.println(myCar1.make);
        System.out.println();
        System.out.println(myCar2.model);
        System.out.println(myCar2.make);

        //Calling methods of the created class
        //myCar.drive();
        //myCar.brake();
    **/

    /**
        //27 - Constructors
        // With the use of constructors we can pass arguments to the same class and same time with creating different objects and calling them we can get different results by that

        //Creating different objects and passing different values in the constructor
        Human human = new Human("Rick",65,70);
        Human human2 = new Human("Morty",50,54);

        //System.out.println(human.name);
        //System.out.println(human2.name);

        human.eat();
        human2.drink();
    **/

    /**
        //28 - Variable Scope
        // local - declared inside a method and visible only to that method
        // global - declared outside a method, but within a class visible to all parts of a class

        DiceRoller diceRoller = new DiceRoller();
    **/

    /**
        //29 - Overloaded Constructors
        Pizza pizza = new Pizza("thin crust","tomato","mozzarella","olive");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    **/
    /**
        //30 - toString Method
        Car car = new Car();

        //This two outputting the same
        System.out.println(car.toString()); //Inplicitely
        System.out.println(car); //Explicitely
    **/
    /**
        //31 - Array of Objects
        //Creating a array of objects using Food
        //int[] numbers = new int[3]; - This is a example for a regular array syntax
        Food[] refrigerator = new Food[3];

        //Crating class objects
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Burger");
        Food food3 = new Food("Sandwich");

        //This is another way of declaring directly values to the array. So we do not need 247,257-260 lines
        //Food[] refrigerator = {food1, food2, food3};

        //Assigning values for created array
        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        //Outputting the stored values
        //Here we are using name property otherwise it will pass the memory location like earlier exercises
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    **/
    /**
        //32 - Object Passing

        //Creating class objects
        Garage garage = new Garage();

        //Assigning car models to the object names car1 and car2
        Car2 car1 = new Car2("BMW");
        Car2 car2 = new Car2("Tesla");

        //Parking car1 and car2 at the garage class by calling park method in the garage class
        garage.park(car1);
        garage.park(car2);
    **/
    /**
        //33 - Static Keyword
        // A Single copy of a variable/method is created and shared. The class owns as the static member.

        //Create class objects to pass some friend names to tha class.
        Friend friend1 = new Friend("Spiderman");
        Friend friend2 = new Friend("Batman");
        Friend friend3 = new Friend("Superman");

        //Calling static variable in the friend class
        //As a good practice its better to call this static variable with using related class names
        //you can access it by using object name created but it is not a good practice
        //System.out.println(Friend.numberOfFriends);

        //Calling a static method from friend class
        Friend.displayFriends();
    **/
    /**
        //34 - Inheritance
        //The process of where one class acquires, the attribute and methods of another class using extend keyword

        //Create class objects to access super class attributes and methods
        Bike bike = new Bike();
        System.out.println("Bike speed is "+ bike.speed);

        //Accessing vehicle method via truck class object since that truck class inherit properties from its super class vehicle
        Truck truck = new Truck();
        truck.go();
    **/

        //35 - Method Overriding
        

     }

    /**
    static void hello(String x, int y){
        System.out.println("Hi! My name is " + x + " I`m " + y + "years old!");
    }
    **/
    /**
    static int add(int x, int y){
        return x+y;
    }
    **/
    /**
    //Methods for overloaded methods
    static int add(int a, int b){
        return a+b;

    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        return a+b+c+d;
    }
    **/
}
