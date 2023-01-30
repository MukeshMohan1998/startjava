package com.mukesh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Gain {               //Switchcase
    public static void main(String[] args) {
        Scanner swi = new Scanner(System.in);
        System.out.println("Enter name");
        String name = swi.nextLine();

        switch (name) {
            case " kalki", "mandy", "kandy" -> System.out.println("Hi" + " " + name.toUpperCase());
            default -> throw new IllegalStateException("Unexpected value: " + name.toUpperCase() +" "+"Name not matched");
        }
    }
}
