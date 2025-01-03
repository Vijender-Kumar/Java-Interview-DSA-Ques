package com.example.interviewPractice.other.myJavaPractice;

import java.util.Arrays;
import java.util.stream.LongStream;

public class parallelStream {
    public static void main(String[] args) {
        long[] num = new long[20000];
        for(int i=0;i<num.length;i++){
            num[i] = i;
        }

        long strt = System.currentTimeMillis();
        final var seqsum = Arrays.stream(num)
                .map(parallelStream::fact)
                .sum();
        long end = System.currentTimeMillis();
        long diff = end-strt;

        System.out.println("Diff in sq:"+diff+"ms, seqsum:"+seqsum);

        long pstrt = System.currentTimeMillis();
        final var parsum = Arrays.stream(num)
                .parallel()
                .map(parallelStream::fact)
                .sum();
        long pend = System.currentTimeMillis();
        long pdiff = pend-pstrt;

        System.out.println("Diff in par:"+pdiff+"ms, parsum:"+parsum);

    }

    public static long fact(long num){
        return LongStream.rangeClosed(1, num)
                .reduce(1, (long a, long b) -> a*b);
    }


















//
//        long[] val = new long[20000];
//        for(int i=0;i<val.length;i++){
//            val[i] = i+1;
//        }
//        long strt = System.currentTimeMillis();
//        long seqsum = Arrays.stream(val)
//                .map(parallelStream::fact)
//                .sum();
//        long end = System.currentTimeMillis();
//        long diff = end-strt;
//        System.out.println("Executed in:"+diff+" ms, and SeqSum is:"+seqsum);
//        long pstrt = System.currentTimeMillis();
//        long parsum = Arrays.stream(val)
//                .parallel()
//                .map(parallelStream::fact)
//                .sum();
//        long pend = System.currentTimeMillis();
//        long pdiff = pend-pstrt;
//        System.out.println("Executed in:"+pdiff+" ms, and ParSum is:"+parsum);
//    }
//
//    public static long fact(long num){
//        return LongStream.rangeClosed(1, num)
//                .reduce(1, (long a, long b) -> a*b);
//    }























//        long[] arr = new long[20000];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = i+1;
//        }
//
//        long strt = System.currentTimeMillis();
//        final var seqSum = Arrays.stream(arr)
//                .map(parallelStream::factorial)
//                .sum();
//        long end = System.currentTimeMillis();
//        long totTime = end-strt;
//        System.out.println("Sequential Time taken:"+totTime+"ms, and total sum of Fact is:"+seqSum);
//
//        long pstrt = System.currentTimeMillis();
//        final var parSum = Arrays.stream(arr)
//                .parallel()
//                .map(parallelStream::factorial)
//                .sum();
//        long pend = System.currentTimeMillis();
//        long ptotTime = pend-pstrt;
//        System.out.println("Parallel Time taken:"+ptotTime+"ms, and total sum of Fact is:"+parSum);
//    }
//
//    public static long factorial(long num){
//        return LongStream.rangeClosed(1, num)
//                .reduce(1, (long a, long b) -> a*b);
//    }
}
