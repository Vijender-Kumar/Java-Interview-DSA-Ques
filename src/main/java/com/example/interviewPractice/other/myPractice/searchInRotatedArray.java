package com.example.interviewPractice.other.myPractice;

import java.util.Arrays;
import java.util.Comparator;

public class searchInRotatedArray {
//    Example 1:
//
//    Input: nums = [4,5,6,7,0,1,2], target = 0
//    Output: 4
//    Example 2:
//
//    Input: nums = [4,5,6,7,0,1,2], target = 3
//    Output: -1
    public static void main(String[] args){
        int[] nums = {6,7,8,1,3,4,5};
        int k =1;

        int left =0;
        int right = nums.length-1;
        int output =-1;

        while(left<=right){
            int mid = left + (right-left) /2;

            if(nums[mid] == k){
                output = mid;
            }

            if(nums[left] <= nums[mid]){
                if(nums[left] <= k && k<nums[mid]){
                    right = mid-1;
                } else{
                    left = mid+1;
                }
            } else{
                if(nums[mid] < k && k<= nums[right]) {
                    left = mid + 1;
                } else{
                    right = mid-1;
                }
            }
        }

        System.out.println("Output at POS:"+ output);























//        int target = 3;
//        int left =0;
//        int output = -1;
//        int right = nums.length -1;
//        while(left<=right){
//            int mid = left + (right-left) /2;
//            if(nums[mid] == target){
//                output = mid;
//            }
//            if(nums[left] <= nums[mid]){
//                if(nums[left] <= target && target < nums[mid]){
//                    right = mid -1;
//                } else{
//                    left = mid +1;
//                }
//            } else{
//                if(nums[mid] < target && target <= nums[right]){
//                    left = mid +1;
//                } else{
//                    right = mid -1;
//                }
//            }
//        }
//
//        System.out.print(output);
    }
}
