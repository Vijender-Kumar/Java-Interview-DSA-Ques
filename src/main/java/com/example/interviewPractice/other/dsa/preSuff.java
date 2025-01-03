package com.example.interviewPractice.other.dsa;

import java.util.Arrays;

public class preSuff {
    public static void main(String[] args){
//        1. Product of Array Except Self
//        Problem Statement:
//        You are given an array nums[]. Construct an array result[] such that result[i] is equal to the product of all elements of nums except nums[i].
//
//        Input:
//        nums = [1, 2, 3, 4]
//
//        Expected Output:
//        result = [24, 12, 8, 6]
        int[] prod = {1,2,3,4};
        int n = prod.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        int[] res = new int[n];

        pre[0] = 1;
        suff[n-1] = 1;

        for(int i=0;i<n-1;i++){
            pre[i+1] = pre[i] * prod[i];
        }
        for(int i=n-1;i>0;i--){
            suff[i-1] = suff[i] * prod[i];
        }
        for(int i=0;i<n;i++){
            res[i] = pre[i] * suff[i];
        }

        System.out.println("Product of array except self:"+ Arrays.toString(res));


//        Sum of Array Except Self
//        Problem Statement:
//        You are given an array nums[]. Construct an array result[] such that result[i] is the sum of all elements of nums except nums[i].
//
//        Input:
//        nums = [1, 2, 3, 4]
//
//        Expected Output:
//        result = [9, 8, 7, 6]

        int[] sum = {1,2,3,4};
        int len1 = sum.length;
        int[] pre1 = new int[len1];
        int[] suff1 = new int[len1];
        int[] res1 = new int[len1];

        pre1[0] = 0;
        suff1[len1-1] = 0;

        for(int i=0;i<len1-1;i++){
            pre1[i+1] = pre1[i] + sum[i];
        }
        for(int i=len1-1;i>0;i--){
            suff1[i-1] = suff1[i] + sum[i];
        }
        for(int i=0;i<len1;i++){
            res1[i] = pre1[i] + suff1[i];
        }

        System.out.println("Sum of array except self:"+ Arrays.toString(res1));
    }
}
