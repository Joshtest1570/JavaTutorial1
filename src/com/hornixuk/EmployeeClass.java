package com.hornixuk;

import java.awt.*;

public class EmployeeClass {

    // define properties of an employee

    int roleid = 1;
    String note = " nore note ";
    String startdate;
    String enddate;
    String JobTitle;
    String address;
    String Name;


    // class constructor
     public EmployeeClass(int roleid, String note, String startdate, String enddate, String jobTitle, String  address, String name ){

        // assign them
        roleid = roleid;
        note = note;
        startdate = startdate;
        enddate = enddate;
        jobTitle = jobTitle;
        address = address;
        name = name;
    }

    //secondly create method or function or action that an employee can perform


    public void DisplayEmployee(){
         System.out.println(roleid);
         System.out.println(note);
         System.out.println(startdate);
    }

    public void can_Work(){
         System.out.println("  cam  work "); }

    public void be_promoted(){
        System.out.println(" can be promoted ");
    }


    public void employee_sacked(){
         System.out.println(" employee can be saked ");
    }


    // access modifier  public , private protected


}
