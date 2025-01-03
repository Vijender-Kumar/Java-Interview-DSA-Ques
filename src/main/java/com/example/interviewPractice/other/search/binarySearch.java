package com.example.interviewPractice.other.search;

public class binarySearch {
    public static void main(String[] args) {
        int[][] bs = {
                {1, 2, 3, 4},
                {9, 10, 11, 15},
                {14, 56, 223, 300}
        };
        int target = 301;
        int left=0;
        boolean b = false;
        int right = bs[0].length-1;
        while(left < bs.length && right>=0) {
            if(bs[left][right] == target){
                b =true;
                break;
            } else if( bs[left][right] < target){
                left++;
            } else {
                right--;
            }
        }
        if(b) {
            System.out.println("Data found at POS:bs[" + left + "][" + right + "]");
        } else{
            System.out.println("Data Not found");
        }
    }
}















//
//        int target = 300;
//        int row = 0;
//        boolean f = false;
//        int col = bs[0].length-1;
//        while(row < bs.length && col>=0){
//            if(bs[row][col] == target){
//                f = true;
//                break;
//            } else if(bs[row][col] > target){
//                col--;
//            } else{
//                row++;
//            }
//        }
//        if(f){
//            System.out.println("Data Found");
//        } else {
//            System.out.println("Not Found");
//        }
//    }
//}
