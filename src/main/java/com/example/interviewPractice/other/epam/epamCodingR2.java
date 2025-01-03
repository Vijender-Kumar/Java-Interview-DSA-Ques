package com.example.interviewPractice.other.epam;

import java.util.Arrays;

public class epamCodingR2 {
    public static void main(String[] args) {

//        Given an array of item weights and cart capacity, find the min number of carts needed to accommodate all the items
//        Input: item_weights = [1,2], cart_capacity = 3
//        Output: 1
//
//        Input: item_weights = [3,2,2,1], cart_capacity = 3
//        Output: 3
//
//        Input: item_weights = [3,5,3,4], cart_capacity = 5
//        Output: 4
        int[] data = new int[]{3, 2, 2, 1};
        int cart_cp = 3;
        Arrays.sort(data);
        int count = 0;
        int left =0;
        int right = data.length-1;
        while(left<=right){
            if(data[left] + data[right] <= cart_cp){
                left++;
            }
            right--;
            count++;
        }
        System.out.println(count);
    }
}
