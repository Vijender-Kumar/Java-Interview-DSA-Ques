package com.example.interviewPractice.other.epam;

import java.util.Arrays;
import java.util.stream.LongStream;

public class threadPractice {
    public static void main(String[] args) throws InterruptedException {
        long[] input = new long[20000];
        for(int i=0;i<input.length;i++){
            input[i] = i;
        }

        long str = System.currentTimeMillis();
        var seqSum = Arrays.stream(input)
                .map(threadPractice::fact)
                .sum();
        long end = System.currentTimeMillis();
        long diff = end-str;

        long pstr = System.currentTimeMillis();
        var parSum = Arrays.stream(input)
                .parallel()
                .map(threadPractice::fact)
                .sum();
        long pend = System.currentTimeMillis();
        long pdiff = pend-pstr;
        System.out.println("Sum of Fact is:"+seqSum+",time:"+diff+"ms");
        System.out.println("Sum of Para is:"+parSum+",time:"+pdiff+"ms");

    }

    public static long fact(long num){
        return LongStream.rangeClosed(1,num)
                .reduce(1, (long a, long b) -> a*b);
    }

    interface Payment{
        void payment(double amount);
    }

    public class gpay implements Payment{

        @Override
        public void payment(double amount) {
            System.out.println("Payment using GPAY");
        }
    }

    public class ppay implements Payment{

        @Override
        public void payment(double amount) {
            System.out.println("Payment using PPAY");
        }
    }

//        Thread t1= new Thread(() -> System.out.println("Thread Started T1"));
//        A t = new A();
//        tr tt = new tr();
//        tt.run();
//        t.start();
//        System.out.println("Thread State:"+t1.getState());
//        t1.start();
//        System.out.println("Thread State:"+t1.getState());
//        Thread.sleep(3000);
//        System.out.println("Thread State:"+t1.getState());
//
//    }
//
//    public static class A extends Thread{
//        @Override
//        public void run(){
//            System.out.println("INside A");
//        }
//    }
//
//    public static class tr implements Runnable{
//
//        @Override
//        public void run() {
//            try {
//                System.out.println("Here");
//                Thread.sleep(5000);
//                System.out.println("After Sleep Here");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}

