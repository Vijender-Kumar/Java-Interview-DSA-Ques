package com.example.interviewPractice.other.myPractice;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxSubarraySum {
//    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//    Output: 6
//    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    public static void main(String[] args){
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};



















//        int curr_sum = nums[0];
//        int max_sum = nums[0];
//
//        for(int i=1;i<nums.length;i++){
//            curr_sum = Math.max(nums[i], nums[i]+curr_sum);
//
//            if(curr_sum > max_sum){
//                max_sum = curr_sum;
//            }
//        }
//        System.out.println(max_sum);




//        int curr_max = nums[0];
//        int glo_max = nums[0];
//        List<Integer> temp = new ArrayList<>();
//        List<Integer> ls = new ArrayList<>();
//        temp.add(nums[0]);
//
//        for(int i=1;i<nums.length;i++){
//            if(curr_max + nums[i] > nums[i]){
//                curr_max = curr_max+nums[i];
//                temp.add(nums[i]);
//            } else{
//                curr_max = nums[i];
//                temp.clear();
//                temp.add(nums[i]);
//            }
//
//            if(curr_max > glo_max){
//                glo_max = curr_max;
//                ls = new ArrayList<>(temp);
//            }
//        }
//
//        System.out.println(ls);
//        System.out.println(glo_max);














//        int maxCurr = nums[0];
//        int maxGlobal = nums[0];
//        for(int i=1;i<nums.length;i++){
//            maxCurr = Math.max(nums[i], maxCurr+nums[i]);
//            if(maxCurr > maxGlobal){
//                maxGlobal = maxCurr;
//            }
//        }
//        System.out.println(maxGlobal);
    }
}
