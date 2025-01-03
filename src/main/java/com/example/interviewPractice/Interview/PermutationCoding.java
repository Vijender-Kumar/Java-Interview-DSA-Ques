package com.example.interviewPractice.Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationCoding {
    public static void main(String[] args){
        int num = 23411;

        String number = String.valueOf(num);
        List<String> permutation = permut(number, "");
        System.out.println("Before Sorting:"+permutation);
        var data = permutation.stream().sorted().toList();
        System.out.println("After Sorting:"+data.size());
    }

    public static List<String> permut(String num, String resp){
        List<String> permu = new ArrayList<>();
        if(num.isEmpty()){
            permu.add(resp);
            return permu;
        }
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            String per = num.substring(0,i)+num.substring(i+1);
            permu.addAll(permut(per, ch+resp));
        }
        return permu;
    }
}
