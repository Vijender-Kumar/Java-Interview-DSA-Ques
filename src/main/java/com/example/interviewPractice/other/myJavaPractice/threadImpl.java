package com.example.interviewPractice.other.myJavaPractice;

public class threadImpl {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder str = new StringBuilder();
        StringBuffer strB = new StringBuffer();
        Thread t1 = new Thread(() -> {
            System.out.println("This is Thread T1:"+ Thread.currentThread().getName());
            for(int i=0;i<1000;i++){
                str.append("A");
                strB.append("X");
            }
        });
        Thread t2 = new Thread(() -> {
            System.out.println("This is Thread T2:"+ Thread.currentThread().getName());
            for(int i=0;i<1000;i++){
                str.append("B");
                strB.append("Y");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("StringBuilder length:"+str.length());
        System.out.println("StringBuffer length:"+strB.length());

    }
}
