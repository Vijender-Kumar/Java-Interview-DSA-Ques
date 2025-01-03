package com.example.interviewPractice.other.sorting;

public class bubbleSort {
    public static void main(String[] args){
        /* Bubble sort is for sorting the element with
         * the adjacent element and response is the largest element in the end
         * O(n^2) is worst and Average,
         * O(n) is best(already in sorted)
         */
        int[] arr = {344, 21, 66, 43, 23, 223};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}












//        for(int i=0; i< n-1;i++){
//        for(int j =0; j< n-i-1;j++){
//        if(arr[j] > arr[j+1]) {
//        int temp = arr[j];
//        arr[j] = arr[j+1];
//        arr[j+1] = temp;
//        }
//        }
//        }