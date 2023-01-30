package com.mukesh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Kain {

    public static void main (String[] args){
//name
        Scanner inputf=new Scanner(System.in);String name ;
        System.out.println("Entername" );
         name = inputf.nextLine(); System.out.println("Username is :" +name +name.toUpperCase());
      //System.out.println("name Length :" +name.length() + " " +name.toUpperCase());
        int ageOfPerson;//age
        System.out.println("age :" );
        Scanner input= new Scanner(System.in);
        ageOfPerson = input.nextInt();
//citizen true/false
        boolean IndianCitizen;
        System.out.println("Indian citizen :");
        Scanner inputt= new Scanner(System.in);
        IndianCitizen=inputt.nextBoolean();


        if(ageOfPerson == 18 && IndianCitizen == true) System.out.println("eligible");
        else  System.out.println("not eligible");

Qain obj=new Qain();
obj.use();

    }
}