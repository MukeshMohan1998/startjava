package com.mukesh;

import java.util.Scanner;

public class Lain
{
    public static void main(String[] args) {
      int bag =10;
      int cost;
      int TravelBag=40;
        System.out.println("Enter cost :" );
        Scanner sc = new Scanner(System.in);
        cost= sc.nextInt();
        System.out.println("cost entered :" +cost);

                           //If else conditions


      if (cost>TravelBag){
          System.out.println("Cost you have :" +cost);
          System.out.println("you can buy the special pen");
          System.out.println("Welcome");
      }
      else if(cost>bag) {
          System.out.println("Cost you have :" +cost);
          System.out.println("you can buy the bag");
          System.out.println("Welcome");
      }
      else{
          System.out.println("Dont have enough money");
      }
    }
}
