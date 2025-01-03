package com.example.interviewPractice.mphasisInterview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findVowelPlace {
    public static void main(String[] args){
        String str = "VIJENDER KUMAR vijender kumar";
        Set<Character> vow = Set.of('A','E','I','O','U','a','e','i','o','u');

        Map<Character, List<Integer>> listMap = IntStream.range(0, str.length())
                .filter(i -> vow.contains(str.charAt(i)))
                .boxed()
                .collect(Collectors.groupingBy(str::charAt));
        listMap.forEach((vowel,pos) -> System.out.println("Vowel:"+vowel + ",Position:"+pos));

        System.out.println("Using List with Map inside of it, Giving output in different lines for each value");
        List<Map.Entry<Character, Integer>> entryList = IntStream.range(0, str.length())
                .filter(i -> vow.contains(str.charAt(i)))
                .mapToObj(i -> Map.entry(str.charAt(i), i))
                .toList();
        entryList.forEach(i -> System.out.println("Vowel:"+i.getKey()+",Position:"+i.getValue()));
    }
}
