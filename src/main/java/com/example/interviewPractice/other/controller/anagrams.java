package com.example.interviewPractice.other.controller;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class anagrams {
    public static void main(String[] args){
        String[] data = {"CARS","REPAID","DUES","NOSE","SIGNED","LANE","PAIRED","ARCS","GRAB","USED","ONES","BRAG","SUED","LEAN","SCAR","DESIGN"};
        Map<String, List<String>> hm = new HashMap<>();
//        for(String word:data){
//            char[] ch = word.toCharArray();
//            Arrays.sort(ch);
//            String str = new String(ch);
//
//            hm.computeIfAbsent(str, ele -> new ArrayList<>()).add(word);
//        }
//
//        Collection<List<String>> ls = hm.values();
//        System.out.println(ls);
//        var output = ls.stream().sorted(Comparator.comparing(List::size)).collect(Collectors.toList());
//        System.out.println(output);
//        [REPAID, PAIRED]
//        [GRAB, BRAG]
//        [LANE, LEAN]
//        [DUES, USED, SUED]
//        [NOSE, ONES]
//        [CARS, ARCS, SCAR]
//        [SIGNED, DESIGN]

//        Map<String, List<String>> hs = new HashMap<>();
//
//        for(String word: data){
//            char[] ch = word.toCharArray();
//            Arrays.sort(ch);
//            String str = new String(ch);
//
//            hs.computeIfAbsent(str, ele -> new ArrayList<>()).add(word);
//        }
//
//        hs.values().forEach(System.out::println);



    }
}
