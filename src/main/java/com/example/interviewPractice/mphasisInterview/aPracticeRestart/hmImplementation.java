package com.example.interviewPractice.mphasisInterview.aPracticeRestart;

import java.util.*;
import java.util.stream.Collectors;

public class hmImplementation {
    public static void main(String[] args){
        String[] data = {"CARS","REPAID","DUES","NOSE","SIGNED","LANE","PAIRED","ARCS","GRAB","USED","ONES","BRAG","SUED","LEAN","SCAR","DESIGN"};
        Map<String, List<String>> ls = new LinkedHashMap<>();
        for(String str:data){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String ns = new String(ch);

            ls.computeIfAbsent(ns, ele -> new ArrayList<>()).add(str);
        }
        var resp = ls.entrySet()
                .stream().sorted((e1,e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .toList();
        for(Map.Entry<String, List<String>> res:resp){
            System.out.println(res.getValue()+":"+res.getKey());
        }

//        String str = "VIJENDER KUMAR";
//        char[] ch = str.toCharArray();
//        Map<String, Integer> hm = new LinkedHashMap<>();
//
//        for(char c: ch){
//            String s = String.valueOf(c);
//
//            hm.put(s, hm.getOrDefault(s, 0)+1);
//        }
//
//        for(Map.Entry<String, Integer> ls: hm.entrySet()){
//            String k = ls.getKey();
//            if(k.charAt(0) >= 'A' && k.charAt(0) <= 'Z'
//            || k.charAt(0) >= 'a' && k.charAt(0) <= 'z'){
//                System.out.println(ls.getKey()+":"+ls.getValue());
//            }
//        }
    }
}
