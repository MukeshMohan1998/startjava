package com.mukesh;

public class methodoverloading {

    public static void main(String[] arge) {
        add(2, 1);
        sub(3, 5);
    }

    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void sub(int num3, int num4) {
        System.out.println(num3 + num4);
    }
}