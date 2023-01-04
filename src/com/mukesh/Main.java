package com.mukesh;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 10;
        //
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        //  numbers[0]=10;
        //   numbers[1]=11;
        String letters = new String("  bc,mnb,mnbvc,mnbvcx");
        System.out.println(letters);
        int len = letters.length();
        letters.toUpperCase();
        System.out.println("length of the characters :" + len + "" + letters.toUpperCase());
        System.out.println("trimmed" + "" + letters.trim());
        char name[] = {'a', 'b', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(name));
        //System.out.println(Arrays.equals(s);
        char name1[] = name.clone();
        for (String s : Arrays.asList(Arrays.toString(name1), "lenth of char:" + len)) {
            System.out.println(s);
        }
    }
}

