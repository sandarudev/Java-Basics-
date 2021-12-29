package com.company;

import package2.C;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.sampled.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
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
    /**
        //35 - Method Overriding
        // Declaring a method in sub class, which is already present in parent class and give its own implementation
        // by the child class

        //Creating class objects to dog (in dog class speak() method is overrided)
        //It is a good practice to add @Override for overrided methods -> Check Dog class
        Dog dog = new Dog();
        dog.speak();

        //This is the super class method and it is overrided in Dog class
        Animal animal = new Animal();
        animal.speak();
    **/
    /**
        //36 - Super Keyword
        // Keyword refers to the superclass (parent) of an object very similar to "this" keyword previously used.
        // You can pass values within the child class to super class by that keyword and also access its methods and attribute using super keyword

        //Creating hero class object to pass attributes
        Hero hero1 = new Hero("Batman",42,"$$$");
        System.out.println(hero1.toString());
    **/
    /**
        //37 - Abstraction (Vehicle2 and Lorry Classes)
        // Abstract classes cannot by instantiated, but they can have a subclass. Abstract methods are declared without an implementation.
        //We cant access it and methods also can define without a body its realted child class can override and give an implementation.

        //Creating class objects, we can only access child class. Abstraction is act as a another security layer
        Lorry lorry = new Lorry();
        lorry.go();
    **/
    /**
        //38 - Access Modifiers (Refer package1 and package2 to see the demonstration)
        //This is another type of security layer
        //This was demonstrated using different packages that contain different classes

        //Down below explain access levels of each access modifier
        // public                 - Class | Package | Subclass | World
        // protected              - Class | Package | Subclass | -----
        // default(no modifier)   - Class | Package | -------- | -----
        // private                - Class | ------- | -------- | -----

        //If we remove public keyword from classes it will only visible within the package
    **/
    /**
        //39 - Encapsulation - Attributes of a class will be hidden or private
        //     can be accessed only through methods (getters& setters)
        //     you should make attributes private if you don`t have a reason to make them public
        //void - not returning anything

        //Create class object for Car3 Class
        Car3 car = new Car3("Toyota","Prado",2022);

        //Get the make of the car by using getters
        System.out.println("Previous Make: " + car.getMake() + "\n");

        //Change the make using setters
        car.setMake("Tesla");

        //Outputting the new make
        System.out.println("Updated Make: "+ car.getMake());
    **/
    /**

        //40 - Copy Objects (Using the same class Car3)
        // After we create a class object and assign values let`s look at how we are going to add that same values to car2
        // It shares the same values but have different memory locations

        //Creating 2 class objects they shared 2 memory locations
        Car3 car1 = new Car3("Toyota","Prius",2000);
        //Car3 car2 = new Car3("Nissan","GTR",2005);

        //copy the same attributes for the car2 with creating copy method to set values
        //car2.copy(car1); // --> this method is available in Car3 Class file

        //2nd way is overriding the class constructor and call the created copy method inside it
        Car3 car2 = new Car3(car1);

        //Output memory location and values of each variable
        //Memory location
        System.out.println("Memory Location: ");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println();

        //Values of each class object
        System.out.println("Car 1 Values: ");
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();

        System.out.println("Car 2 Values: ");
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    **/
    /**
        //41 - Interface (Rabbit, Hawk, Fish Classes and Prey, Predator Interfaces)
        // a template tha can be applied to a class. Similar to inheritance, but specifies a class has/must do.
        // classes can apply more than one interface since inheritance is limited to 1 super class

        //Create class object for rabbit that implements prey interface
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        //Crete class object for fish class that implements two interfaces
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    **/
    /**
        //42 - Polymorphism - poly - "many" & morph - "form" (Using Aero, A310,A320,A330 classes)
        //     the ability of an object to identify as more than one type
        //     It identifies what in common and make thing easier to access and give different types
        //     like in example aero is sub class and have 3 child classes aero is the common thing
        //      a310 is identified as a310 and also indetify as aero that is the key point****

        //Create class objects to access each classes
        Aero aero = new Aero();
        A310 a310 = new A310();
        A320 a320 = new A320();
        A330 a330 = new A330();

        //Creating a array to hold the class object and make accessible easily otherwise we have line by line have execute
        //        a310.go();
        //        a320.go();
        //        a330.go();
        Aero[] aeroTypes = {a310,a320,a330};

        //In this for loop x is refers to the position of the array. Aero is the data type and aeroTypes refers to the array
        for (Aero x : aeroTypes){
            x.go();

        }
    **/
    /**
        //43 - Dynamic Polymorphism (Animal2,Elepahant and Lion classes)
        // poly-morphism = many shapes/forms
        // dynamic = after compilation (during runtime)
        // In dynamic polymorphism let user to decide what type of form that they need to access.
        // initially it allocate memory for common form and access it according to the users input

        //Create scanner class object to take inputs
        Scanner scanner = new Scanner(System.in);

        //Create memory allocation and later decide what actually is
        Animal2 animal;

        //Getting user input
        System.out.println("What animal do you want to choose? ");
        System.out.println("Choose (1=Elepant) or (2=Lion): ");

        //Store user input in a integer
        int choice = scanner.nextInt();

        //Check whether what user eneterd and display accordingly initiating respective constructor for the allocated memory
        // and use their method
        if (choice == 1){
            animal = new Elephant(); //Initiating the constructor to the allocated memory and use methods within that class
            animal.color();
        }
        else if(choice == 2){
            animal = new Lion();
            animal.color();
        }
        else{
            System.out.println("You have entered invalid number!!");
            animal = new Animal2();
            animal.color();
        }
    **/
    /**

        //44 - Exception Handling
        // exception = an event that occurs during the execution of a program that,
        //             disrupts the normal flow of instructions

        //As a practice finally is used to close all the scanners and files opened and if you can
        // handle each exception one by one it`s meaningful.
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter a whole number to devide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to devide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);
        }
        catch (Exception e){
            System.out.println("Somethin went wrong: " + e );
        }
        finally {
            scanner.close();
        }
    **/
    /**
        //45 - File Class
        // file = An abstract representation of files and directory pathnames

        //Check whether that file exist in the project or folder location and some file class methods
        //Create file class object
        File file = new File("secret_message.txt");

        if (file.exists()){
            System.out.println("That file exist! ");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();

        }
        else{
            System.out.println("That file doesn`t exist!");
        }
    **/
    /**
        //46 - File Writer (Write to a file)

        try{
            FileWriter writer = new FileWriter("myself.txt");
            writer.write("My name is Sandaru D Silva \nI`m a student @NSBM Green University \nI`m 24 years old! \n");
            writer.append("- Sandaru D Silva -");
            writer.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    **/
    /**
        //47 - FileReader (Read a file)
        // FileReader = read the contents of a file as a stream of characters. One by one read() returns an int value
        //              which contains the byte value when read() returns -1, there is no more data to be read.

        //Create FileReader class object (instant)
        try {
            FileReader reader = new FileReader("art.txt");

            //reader data stored to int type of variable that it return data is available or not by a number.
            // if there is no number available it will return -1 that is the key point
            int data = reader.read();

            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    **/
    /**
        //48 - Audio

        //Create scanner class object to get user inputs
        Scanner scanner = new Scanner(System.in);

        File file = new File("charithaS.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); //passing the audio file to audio input stream
        Clip clip = AudioSystem.getClip(); //creating clip object to process audio
        clip.open(audioStream); //opening the audio stream

        String response = "";

        while(!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response){
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("You entered invalid choice!");
            }

        }
        System.out.println("Byee!!");
    **/
    /**
        //49 - GUI
        // JFrame = A GUI

        //Basic JFrame controls
        //This is a one way of making a JFrame. In other way we can create a class that extends from JFrame class and
        // add these all configurations at that class constructor. Once we create a object of that class it will execute


        JFrame frame = new JFrame(); //creates a frame
        frame.setVisible(true); //make frame visible
        frame.setTitle("Master Program"); //set the title of the frame
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //frame cannot be resizable

        //Adding a image icon to the frame
        ImageIcon image = new ImageIcon("instaLogo.png"); //create an image icon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(75, 25, 32)); //change color of the background


        //Create MyFrame class objet to run the frame (2nd method)
        MyFrame myFrame = new MyFrame();
    **/

        //50 - Labels

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
