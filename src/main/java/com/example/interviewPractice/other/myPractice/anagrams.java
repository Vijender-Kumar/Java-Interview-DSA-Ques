package com.example.interviewPractice.other.myPractice;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class anagrams {
    public static void main(String[] args){
        String[] data = {"CARS","REPAID","DUES","NOSE","SIGNED","LANE","PAIRED","ARCS","GRAB","USED","ONES","BRAG","SUED","LEAN","SCAR","DESIGN"};
        String[] input = {"COAL", "COLAS, SOLAC"};

        Map<String,List<String>> hm = new HashMap<>();
        for(String ls: data){
            char[] ch = ls.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);

            hm.computeIfAbsent(str, ele -> new ArrayList<>()).add(ls);
        }

//        hm.values().forEach(System.out::println);
        for(Map.Entry<String, List<String>> d: hm.entrySet()){
            System.out.println(d.getKey()+ ":" +d.getValue());
        }

//        final var collect = Arrays.stream(data)
//                .collect(Collectors.groupingBy(word -> {
//                    char[] ch = word.toCharArray();
//                    Arrays.sort(ch);
//                    return new String(ch);
//                }));
//        collect.values().forEach(System.out::println);


//        Map<String, List<String>> hMap = Arrays.stream(data)
//                .collect(Collectors.groupingBy(word -> {
//                    char[] ch = word.toCharArray();
//                    Arrays.sort(ch);
//                    return new String(ch);
//                }));
//        hMap.values().forEach(System.out::println);
//        hMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

//        String[] input = {"COAL", "COLA"};
//        Map<String, Integer> hm = new HashMap<>();
//
//        for(String word: data){
//            char[] ch = word.toCharArray();
//            Arrays.sort(ch);
//            String datas = new String(ch);
//
//            hm.put(datas, hm.getOrDefault(datas, 0)+1);
//        }
//
//        for(Map.Entry<String, Integer> hm1: hm.entrySet()){
//            if(hm1.getValue() >2) {
//                log.info("Key:{}, Value:{}", hm1.getKey(), hm1.getValue());
//            }
//        }

//        String[] data = {"CARS","REPAID","DUES","NOSE","SIGNED","LANE","PAIRED","ARCS","GRAB","USED","ONES","BRAG","SUED","LEAN","SCAR","DESIGN"};

//        Map<String, List<String>> newList = new HashMap<>();
//
//        for(String word: data){
//            char[] ch = word.toCharArray();
//            Arrays.sort(ch);
//            String chr = new String(ch);
//
//            newList.computeIfAbsent(chr, ele-> new ArrayList<>()).add(word);
//        }
//
//        for(List<String> group : newList.values()){
//            log.info("final Anagram List:{}", group);
//        }
//        newList.values().forEach(System.out::println);

    }
}
