package com.example.interviewPractice.other.sorting;

public class insertionSort {
    public static void main(String[] args) {
        /* Insert sort will take the input from second element and take left as sorted
        and then it will take the key and compare with left side and it will
        swap if the left side input is greater then the key and
        it will place the key in the correct position in the sorted side */
        int[] arr = {235,4542,463,135,663,11,20,231,235};
        int n = arr.length;

        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}





















//        for(int i=1;i<n;i++){
//        int key = arr[i];
//        int j = i-1;
//
//        while(j>=0 && arr[j] > key){
//        arr[j+1] = arr[j];
//        j -= 1;
//        }
//
//        arr[j+1] = key;
//        }