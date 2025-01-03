package com.example.interviewPractice.other.funcInterface;

public class functionalInterface {
    public static void main(String[] args){

        Operation add = (a,b) -> a+b;
        Operation sub = (a,b) -> a-b;

        System.out.println(add.operate(2,3));
    }
}
