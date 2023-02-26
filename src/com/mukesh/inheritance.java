package com.mukesh;

public class inheritance {
     a(){
         System.out.println("this is a class");
     }
     a(int i){
         System.out.println("i a");
     }
}

class b extends inheritance{
    b(){
        System.out.println("this is b class");
    }
    b(int i , int j){
        System.out.println("i b");
    }
}
