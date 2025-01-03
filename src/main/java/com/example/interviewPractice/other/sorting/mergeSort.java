package com.example.interviewPractice.other.sorting;

public class mergeSort {
    public static void main(String[] args) {
        /* Merge sort is to sort the array
        1. divide array in single part
        2. start merging in sorted manner
        */
//        int[] arr = {23,77,54,32,11,234,322,53};
//
//        sortMerge(arr, 0,arr.length-1);
//    }
//
//    public static void sortMerge(int[] arr, int left, int right){
//        if(left<right){
//            int middle = left+(right-left)/2;
//
//            sortMerge(arr, left, middle);
//            sortMerge(arr, middle, right);
//
//            mergeData(arr, left,middle,right);
//        }
//    }
//
//    public static void mergeData(int[] arr, int left, int middle, int right){
//        int n1 = middle-left+1;
//        int n2 = right-middle;
//
//        int[] left1 = new int[n1];
//        int[] right1 = new int[n2];
//
//        for(int i=0;i<n1;i++){
//            left1[i] = arr[left+i];
//        }
//        for(int j=0;j<n2;j++){
//            right1[j] = arr[middle+1+j];
//        }
//    }

        int[] a1 = {1,3,5,7,10};
        int[] a2 = {2,4,6,8,9};
        int n1 = a1.length;
        int n2 = a2.length;
        int[] n = new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a1[i] <= a2[j]){
                n[k++] = a1[i++];
            } else{
                n[k++] = a2[j++];
            }
        }
        while(i<n1){
            n[k++] = a1[i++];
        }
        while(j<n2){
            n[k++] = a2[j++];
        }

        for(int num:n){
            System.out.print(num+ " ");
        }
    }
}
