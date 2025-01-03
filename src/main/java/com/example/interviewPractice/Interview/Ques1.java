package com.example.interviewPractice.Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ques1 {
    public static void main(String[] args){
        int n = 4312;

        String str = String.valueOf(n);

        List<String> numberList = perm(str, "");
        System.out.println(numberList);
        List<String> sorted = numberList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);
        for(int i=0;i<sorted.size();i++){
            if(str.equals(sorted.get(i))){
                if(i < sorted.size()-1){
                    System.out.println(sorted.get(i+1));
                } else{
                    System.out.println("Not available");
                }
            }
        }

        System.out.println("----Converting the List to Integer format-------");

        List<Integer> numberList1 = perm(str, "").stream()
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numberList1);
        List<Integer> sorted1 = numberList1.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted1);

        for(int i=0;i<sorted1.size();i++){
            if(n == sorted1.get(i)){
                if(i < sorted1.size()-1){
                    System.out.println(sorted1.get(i+1));
                } else{
                    System.out.println("Data Not available");
                }
            }
        }
    }

    public static List<String> perm(String str, String resp){
        List<String> permut = new ArrayList<>();
        if(str.isEmpty()){
            permut.add(resp);
            return permut;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String perm = str.substring(0,i)+str.substring(i+1);
            permut.addAll(perm(perm, resp+ch));
        }
        return permut;
    }
}

