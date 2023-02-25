package com.mukesh;

class student{
    int rollno;
    int classe;
    String principal="mukesh";

    void display(){
        System.out.println("hi");
    }


}

public class staticc {
    public static void main(String[] args){
        student karthik =new student();
        karthik.rollno=12001;
        karthik.classe= 12;
        karthik.principal ="mukesh";

        student vimal=new student();
        vimal.rollno=12002;
        vimal.classe=12;
        vimal.principal="mukesh";

    }

    }

