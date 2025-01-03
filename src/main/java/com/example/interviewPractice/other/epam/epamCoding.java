package com.example.interviewPractice.other.epam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class epamCoding {
    //    You are given an m x n integer matrix matrix with the following two properties
//    Each row is sorted in non-decreasing order. The first integer of each row is greater
//    than the last integer of the previous Given an integer target, return true if target
//    is in matrix or false otherwise You must write a solution in O(log(m * n)) time complexity.
//    Input: matrix = [ 1, 3, 5, 7], [10,11,16,20], [23,30,34,60]], target =3 Output: true
    public static void main(String[] args){
//        int[][] matrix = {
//                {1, 3, 5, 7},
//                {10, 11, 16, 20},
//                {23, 40, 60, 65}
//        };
//        int target = 65;
//        int m = 0;
//        boolean b = false;
//        int n = matrix[0].length-1;
//        while(m<matrix.length && n >=0){
//            if(matrix[m][n] == target){
//                b = true;
//                break;
//            }
//            else if(matrix[m][n] < target){
//                m++;
//            } else{
//                n--;
//            }
//        }
//        if(b){
//            System.out.println("DAta found at POS:"+m+","+n);
//        } else{
//            System.out.println("DAta not found");
//        }

        int[] data = new int[]{3, 2, 2, 1};
        int cart_cp = 3;
        int left = 0;
        int count = 0;
        Arrays.sort(data);
        int right = data.length - 1;
        while (left <= right) {
            // If the current left + right elements fit in one cart
            if (data[left] + data[right] <= cart_cp) {
                left++;
            }
            // Always move the right pointer, as this item takes up a cart
            right--;
            count++;  // A cart is always used, regardless of whether one or two items are in it
        }
        System.out.println(count);


















//        boolean output = false;
//        int left = 0;
//        int right = matrix[0].length - 1;
//
//        while(left < matrix.length && right>=0){
//            if(matrix[left][right] == target){
//                output = true;
//                break;
//            } else if(matrix[left][right] < target){
//                left++;
//            } else{
//                right--;
//            }
//        }
//        if (output) {
//            System.out.println("Matrix data at POS:" + left + ", " + right);
//        } else{
//            System.out.println("Not Found");
//        }
    }
}
