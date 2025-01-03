package com.example.interviewPractice.other.myJavaPractice;

public class Parent {
    public void m1(){
        System.out.println("Hello m1");
        this.m2();
    }

    public void m2(){
        System.out.println("Hello m2 from parent");
    }

    public static void main(String[] args){
        Parent c = new Child();
        c.m1();
    }

}


