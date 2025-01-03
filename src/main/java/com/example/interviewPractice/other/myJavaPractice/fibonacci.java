package com.example.interviewPractice.other.myJavaPractice;

public class fibonacci {
    public static void main(String[] args){
//        0, 1, 1, 2, 3, 5, 8, 13, 21
        int n = 9;
//        int n1 =0, n2=1;
//        System.out.print(n1+", "+n2);
//        for(int i=2;i<n;i++){
//            int n3 = n1+n2;
//            System.out.print(", "+n3);
//            n1= n2;
//            n2 = n3;
//        }
        for(int i=0;i<n;i++){
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
