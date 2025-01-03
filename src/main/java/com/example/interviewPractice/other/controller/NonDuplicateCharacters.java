package com.example.interviewPractice.other.controller;

import java.util.*;
import java.util.LinkedList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonDuplicateCharacters {
    public static void main(String[] args) {
        String str = "FirstData";
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        for(char ch: str.toCharArray()){
            lhm.put(ch, lhm.getOrDefault(ch,0)+1);
        }
        var data = lhm.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse('!');
        System.out.println(data);
//        System.out.println(str.chars().mapToObj(e -> (char) e)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream()
//                .filter(e -> e.getValue()==1)
//                .findFirst().orElse(null).getKey());


//        var data = str.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream()
//                .filter(d -> d.getValue() == 1)
////                .map(Map.Entry::getKey)
//                .findFirst().orElse(null).getKey();
//        System.out.println(data);
//        String output = "";
//        for(int i=0;i<str.length();i++){
//            char c = str.charAt(i);
//            boolean b = false;
//
//            for(int j=0;j<str.length();j++){
//                if(i!=j && str.charAt(j) == c){
//                    b = true;
//                    break;
//                }
//            }
//
//            if(!b){
//                output += c;
//            }
//        }
//        System.out.println(output);














        /*StringBuilder s = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            boolean f = false;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(j) == ch){
                    f = true;
                    break;
                }
            }
            if(!f){
                s.append(ch);
            }
        }*/


//        System.out.println(data);
//        for(int i =0;i<str.length();i++){
//            char ch = str.charAt(i);
//            boolean f = false;
//            for(int j =0;j<str.length();j++){
//                if(i != j && str.charAt(j) == ch){
//                    f= true;
//                    break;
//                }
//            }
//
//            if(!f){
//                s.append(ch);
//            }
//        }
//        System.out.println("Non Duplicate String:"+ s);


    }
}
