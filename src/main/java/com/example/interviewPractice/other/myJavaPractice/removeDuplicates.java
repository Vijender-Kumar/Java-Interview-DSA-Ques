package com.example.interviewPractice.other.myJavaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args){
        int[] arr = { 1,2,2,2,24,4,4,5,6,7};
        Set<Integer> st = new HashSet<>();

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
            st.add(arr[i]);
        }
        System.out.println(st);

        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> hm1: hm.entrySet()){
            System.out.print(hm1.getKey().toString()+ " ");
        }

        int n =arr.length;
        int j =0;
        for(int i=0;i<n;i++){
            boolean isUnique = true;
            for(int k=0;k<j;k++){
                if(arr[i] == arr[k]){
                    isUnique = false;
                    break;
                }
            }

            if(isUnique){
                arr[j] = arr[i];
                j++;
            }
        }

        System.out.println("Unique");
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
