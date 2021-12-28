package com.company;

public class Car3 {

    private String make;
    private String model;
    private int year;

    Car3(String make, String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    //2nd method of copying object using overriding the Car3 class constructor
    Car3(Car3 x){
        this.copy(x);
    }

    //Getters
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    //Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //This method is setting the passed value for this private variables
    //Argument data type is defined type according to the class name
    public void copy(Car3 x){
        this.setMake(x.make);
        this.setModel(x.model);
        this.setYear(x.year);
    }
}
