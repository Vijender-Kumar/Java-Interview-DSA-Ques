package com.example.interviewPractice.other.myPractice;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class maxNumberKPairs {

//    You are given an integer array nums and an integer k.
//
//    In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
//
//    Return the maximum number of operations you can perform on the array.
//
//
//
//    Example 1:
//
//    Input: nums = [1,2,3,4], k = 5
//    Output: 2
//    Explanation: Starting with nums = [1,2,3,4]:
//            - Remove numbers 1 and 4, then nums = [2,3]
//            - Remove numbers 2 and 3, then nums = []
//    There are no more pairs that sum up to 5, hence a total of 2 operations.
//            Example 2:
//
//    Input: nums = [3,1,3,4,3], k = 6
//    Output: 1
//    Explanation: Starting with nums = [3,1,3,4,3]:
//            - Remove the first two 3's, then nums = [1,4,3]
//    There are no more pairs that sum up to 6, hence a total of 1 operation.
    public static void main(String[] args){
        int[] arr = {3,1,3,4,5,4,8,3,0,8};
        int k =11;






















//        Arrays.sort(arr);
//        int k = 8;
//        int left = 0;
//        int count = 0;
//        int right = arr.length - 1;
//        while(left < right){
//            int sum = arr[left] + arr[right];
//            if(k == sum){
//                count++;
//                left++;
//                right--;
//            } else if( sum < k ){
//                left++;
//            } else{
//                right--;
//            }
//        }
//        System.out.println(count);
    }
}
