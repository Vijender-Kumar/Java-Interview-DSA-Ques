package com.example.interviewPractice.other.epam;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class stringQues {
    public static void main(String[] args) {
        String s = "VIVCKY", t = "ABC";
//        Output: "BANC"
        int output =-1;
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for(int i=0;i<s.length();i++){
            if(charCount.get(s.charAt(i)) == 1){
                output = i;
                break;
            }
        }
        System.out.println(output);
    }

//        String str = "xabbbaxcibbbabbby";
////        String str = "abc";
////        String str = "pwwkew";
//        String ss = "";
//        String max = "";
//        for(int i=0;i<str.length();i++){
//            for(int j=i+1;j<=str.length();j++){
//                ss = str.substring(i,j);
////                if(palindrome(ss) && max.length()<ss.length()){
////                    max = ss;
////                }
//
//                System.out.println("args = " + palindrome("xabbbax"));
//            }
//        }
//        System.out.println("Max Sub:"+max);
//    }
//    public static boolean palindrome(String ss){
//        return false;
//    }





















//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j <= str.length(); j++) {
//                ss = str.substring(i, j);
////                if(palindrome(ss) && max.length()<ss.length()){
////                    max = ss;
////                }
//                if(hasUnique(ss) && max.length() <= ss.length()){
//                    max = ss;
//                }
//            }
//        }
//        System.out.println(max);
//    }
//
//    public static boolean hasUnique(String ss){
//        HashSet<Character> hs = new HashSet<>();
//        for(char c:ss.toCharArray()){
//            if(!hs.add(c)){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean palindrome(String ss) {
//        String rev = "";
//        for(int i=ss.length()-1;i>=0;i--){
//            rev += ss.charAt(i);
//        }
//        if(rev.equals(ss)) {
//            return true;
//        }
//        return false;
//    }












//        String ps = "";
//        for(int i=0;i<str.length();i++){
//            for(int j=i+1;j<str.length();j++){
//                ss = str.substring(i,j);
////                if(palindrome(ss) && ps.length()<=ss.length()){
////                    ps = ss;
////                }
//                if(hasUnique(ss) && ps.length()<=ss.length()){
//                    ps = ss;
//                }
//            }
//        }
//        System.out.println(ps+ " "+ ps.length());
//    }
//
//    public static boolean palindrome(String ss){
//        String rev = "";
//        for(int i=ss.length()-1;i>=0;i--){
//            rev += ss.charAt(i);
//        }
//        if(rev.equals(ss)) {
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean hasUnique(String ss){
//        HashSet<Character> hs = new HashSet<>();
//        for(char c:ss.toCharArray()){
//            if(!hs.add(c)){
//                return false;
//            }
//        }
//        return true;
//    }
}
