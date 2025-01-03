package com.example.interviewPractice.other.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class quickSort {
    public static void main(String[] args){
        int[] arr = {40,20,15,55,50,10};
        quicksrt(arr, 0 , arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void quicksrt(int[] arr, int low, int high){
        if(low<high) {
            int pi = partition(arr, low, high);
            quicksrt(arr, low, pi-1);
            quicksrt(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i =low-1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
