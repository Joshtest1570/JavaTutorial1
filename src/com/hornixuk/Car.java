package com.hornixuk;

public class Car {

     String color;
     String modelType;
     int door;
     String tyres;
     String gearType;
     String modelClasses;
     int seatNumber;
     String engine;
     String wheel ;
     String registeredYear;

     // class constructor

    public Car( String c, String modelType ){
        color = c ;
        this.modelType =  modelType;
    }


    public void DisplayCar(){
        System.out.print("This is the color of  your car"    + color);
        System.out.print("*** This is the model type of your car "  +  modelType);
        System.out.print("This is the number of doors"   + door);
        System.out.print( "The car runs on flat tyres"   + tyres);
        System.out.print("the car has automatic gear type" + gearType);
    }

     public void can_drive(){
        System.out.print(" I can drive "); }

     public void can_upgrade(){
        System.out.print(" I can upgrade "); }

     public void can_destroyed(){
        System.out.print(" can be destroyed "); }
}
