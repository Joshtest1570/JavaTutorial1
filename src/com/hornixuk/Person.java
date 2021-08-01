package com.hornixuk;

public class Person {


    private String color;
    private String sex;
    int age;
    String diet;
    String weight;
    String height;
    String bodyShape;
    String bloodGroup;
    String hair;

    // Class constructor

     public Person( String sex,  int a, String b, String hair ){


         // assign role
            this.sex = sex ;
            age = a;
            bloodGroup = b;
            this.hair = hair ;






   }
   public void DisplayPerson(){
         System.out.print("this is the john body color" + color);
         System.out.print("This is the Jon gender" + sex);
         System.out.print("This is John age"   +age);
         System.out.print("John is a vegetarian" + diet);
   }
   public void can_eat(){
         System.out.print("  can eat ");
   }
   public void can_birth(){
         System.out.print(" can birth ");
   }
   public void can_died(){
         System.out.print(" can died ");
   }



}
