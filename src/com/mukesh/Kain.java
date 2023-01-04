package com.mukesh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Kain {

    public static void main (String[] args){
//name
        String name;
        Scanner inputf=new Scanner(System.in);
        System.out.println("Entername");
        name=inputf.next();
//age
        int ageOfPerson;
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
        }
    }

