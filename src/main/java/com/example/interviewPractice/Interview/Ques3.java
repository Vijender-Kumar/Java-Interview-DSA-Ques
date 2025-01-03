package com.example.interviewPractice.Interview;

import java.util.*;
import java.util.stream.Collectors;

public class Ques3 {
    public static void main(String[] args) {
        String data = "";
        char out = highestOccuringChar(data);
        System.out.println(out);
    }
    public static char highestOccuringChar(String str) {
        //Your code goes here
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char ch:str.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }
        hashMap.forEach((key, val) -> System.out.println(key+":"+val));
        Optional<Map.Entry<Character, Integer>> maxData = hashMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        return maxData.map(Map.Entry::getKey).orElse('!');
//        int highFreq = 0;
//        int highfreqChar = ' ';
//        for(char ch: hashMap.keySet()){
//            System.out.print(ch+":");
//            int freq = hashMap.get(ch);
//            System.out.print(freq+",");
//            if(freq>highFreq){
//                highFreq = freq;
//                highfreqChar = ch;
//            }
//        }
//        System.out.println(highFreq+":"+(char)highfreqChar);
//        return (char)highfreqChar;
    }
}
