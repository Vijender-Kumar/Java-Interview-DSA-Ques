package com.example.interviewPractice.other.myJavaPractice;

import java.util.Arrays;
import java.util.stream.LongStream;

public class stream {
    public static void main(String[] args){
        long[] num = new long[20000];
        for(int i=0;i<num.length;i++){
            num[i] = i;
        }
        long strt = System.currentTimeMillis();
        long seqSum = Arrays.stream(num)
                .map(stream::fact)
                .sum();
        long end = System.currentTimeMillis();

        long diff = end-strt;
        System.out.println("this is Seq Fact sum:"+seqSum + ", time take is:"+diff+"ms");

        long pstrt = System.currentTimeMillis();
        long parSum = Arrays.stream(num)
                .parallel()
                .map(stream::fact)
                .sum();
        long pend = System.currentTimeMillis();

        long pdiff = pend-pstrt;
        System.out.println("this is Seq Fact sum:"+parSum + ", time take is:"+pdiff+"ms");
    }

    public static long fact(long num){
        return LongStream.rangeClosed(1, num)
                .reduce(1, (long a, long b) -> a*b);
    }

}
