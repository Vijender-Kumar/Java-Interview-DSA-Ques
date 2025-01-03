package com.example.interviewPractice.MockInterview;

import java.util.*;
import java.util.stream.Collectors;

public class Ques3 {
    public static void main(String[] args){
        String[] data = {"CARS","REPAID","DUES","NOSE","SIGNED","LANE","PAIRED","ARCS","GRAB","USED","ONES","BRAG","SUED","LEAN","SCAR","DESIGN"};
        Map<String, List<String>> hm = new HashMap<>();
        for(String str:data){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            hm.computeIfAbsent(s, ele -> new ArrayList<>()).add(str);
        }

        for(Map.Entry<String, List<String>> ls : hm.entrySet()){
            System.out.println(ls.getKey()+":"+ls.getValue());
        }

        System.out.println("Output after formatting with list size::::");
        hm.entrySet().stream()
                .sorted((e1,e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> System.out.println(e.getValue()));
    }
}
