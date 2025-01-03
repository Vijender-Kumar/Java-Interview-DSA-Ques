package com.example.interviewPractice.other.controller;

import java.util.*;

public class data {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder str = new StringBuilder();
//        StringBuffer str = new StringBuffer();
        Thread t1 = new Thread(() ->{
            for(int i=0;i<1000;i++){
                str.append("A");
            }
        });

        Thread t2 = new Thread(() ->{
            for(int i=0;i<1000;i++){
                str.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();t2.join();
        System.out.println(str.length());
        //Minimum substring having all the target data characters
//        String str = "VVICKYVIJ";
//        String data = "CVIJ";

//        for(int i=0;i<str.length();i++) {
//            for (int j = i + 1; j <= str.length(); j++) {
//            }
//        }

//        Map<String, Integer> hm = new HashMap<>();
//        char[] ch = str.toCharArray();
//        for(char d: ch){
//            String s = String.valueOf(d);
//            hm.put(s, hm.getOrDefault(s,0)+1);
//        }
//
//        for(Map.Entry<String, Integer> ls:hm.entrySet()){
//            System.out.println(ls.getKey()+ ":" + ls.getValue());
//        }
//
//        var output = hm.entrySet().stream().max(Map.Entry.comparingByValue()).get();
//
//        for(int i=0;i< output.getValue();i++){
//            System.out.print(output.getKey());
//        }

    }













//        String minSubstring = "";
//        int minLength = Integer.MAX_VALUE;
//
//        // Iterate over all possible substrings
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j <= str.length(); j++) {
//                String ss = str.substring(i, j);
//                if (containsAllChars(ss, data) && data.length() <= ss.length()) {
//                    System.out.println(ss);
//                    if (ss.length() < minLength) {
//                        minLength = ss.length();
//                        minSubstring = ss;
//                    }
//                }
//            }
//        }
//
//        if(minSubstring.isEmpty()){
//            System.out.println("Not found");
//        } else {
//            System.out.println("Shortest substring containing all characters of data: " + minSubstring);
//        }
//    }
//
//    public static boolean containsAllChar(String ss, String data){
//        int[] count = new int[128];
//        for(char ch: data.toCharArray()){
//            count[ch]++;
//        }
//        for(char ch:ss.toCharArray()){
//            if(count[ch]>0){
//                count[ch]--;
//            }
//        }
//
//        for(char ch: data.toCharArray()){
//            if(count[ch]>0){
//                return false;
//            }
//        }
//        return true;
//    }

    // Helper method to check if the substring contains all characters in data
//    private static boolean containsAllChars(String ss, String data) {
//        // Create a frequency map of characters in data
//        Map<Character, Integer> dataCount = new HashMap<>();
//        for (char c : data.toCharArray()) {
//            dataCount.put(c, dataCount.getOrDefault(c, 0) + 1);
//        }
//        Map<Character, Integer> ssCount = new HashMap<>();
//        for (char c : ss.toCharArray()) {
//            ssCount.put(c, ssCount.getOrDefault(c, 0) + 1);
//        }
//        for (Map.Entry<Character, Integer> entry : dataCount.entrySet()) {
//            if (ssCount.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
//                return false;
//            }
//        }
//        return true;
//    }

    private static boolean containsAllChars(String ss, String data) {
        int[] count = new int[128]; // assuming ASCII
        for (char c : data.toCharArray()) {
            count[c]++;
        }
        for (char c : ss.toCharArray()) {
            if (count[c] > 0) {
                count[c]--;
            }
        }
        for (char c : data.toCharArray()) {
            if (count[c] > 0) {
                return false;
            }
        }
        return true;
    }
//        String[] data = {"CARS","REPAID","DUES","NOSE","SIGNED","LANE","PAIRED","ARCS","GRAB","USED","ONES","BRAG","SUED","LEAN","SCAR","DESIGN"};
//        Map<String, List<String>> ls = new HashMap<>();
//
//        for(String word:data){
//            char[] ch = word.toCharArray();
//            Arrays.sort(ch);
//            String str = new String(ch);
//
//            ls.computeIfAbsent(str, d -> new ArrayList<>()).add(word);
//        }
//
//        ls.values().forEach(System.out::println);
//         [ 11,3, 5, 7], [10,11,16,20], [23,30,34,60]], target =3 Output: true
//    }
}
