package com.example.interviewPractice.other.epam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class maxPalindrome {
    public static void main(String[] args) {
        String str = "xabbbaxcbbbabbby";
        String ss = "";
        String max = "";
        String mx = "";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<=ch.length;j++){
                ss = str.substring(i,j);
//                System.out.println(ss);
                if(palindrome(ss) && max.length()<=ss.length()){
                    max = ss;
                }
                if(hasUnique(ss) && mx.length()<=ss.length()){
                    mx = ss;
                }
            }
        }

        System.out.println("MaxPalindrome:"+max+",Max Unique:"+mx);
    }

    public static boolean hasUnique(String ss){
        Set<Character> hs = new HashSet<>();
        for(char ch: ss.toCharArray()){
            if(!hs.add(ch)){
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome(String ss){
        int left =0;
        int right = ss.length()-1;
        while(left<right){
            if(ss.charAt(left) != ss.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }







//        for(int i=0;i< str.length();i++){
//            for(int j=i+1;j<= str.length();j++){
//                ss = str.substring(i,j);
////                System.out.println(ss);
////                if(palindrome(ss) && max.length()<=ss.length()){
////                    max = ss;
////                }
//                if(hasUnique(ss) && max.length()<=ss.length()){
//                    max = ss;
//                }
//            }
//        }
//        System.out.println(max);
//
//    }
//    public static boolean palindrome(String ss){
//        String rev = "";
//        for(int i=ss.length()-1;i>=0;i--){
//            rev += ss.charAt(i);
//        }
//        if(rev.equals(ss)){
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean hasUnique(String ss){
//        HashSet<Character> hs = new HashSet<>();
//        for(char ch:ss.toCharArray()){
//            if(!hs.add(ch)){
//                return false;
//            }
//        }
//        return true;
//    }


//
//
//
//
//        for(int i=0;i<str.length();i++){
//            for(int j=i+1;j<str.length();j++){
//                ss = str.substring(i,j);
//                if(palindrome(ss) && max.length() <= ss.length()) {
//                    max = ss;
//                }
//            }
//        }
//        System.out.println("Substring:"+max);
//    }
//
//    public static boolean palindrome(String str){
//        String rev = "";
//        for(int i=str.length()-1;i>=0;i--){
//            rev += str.charAt(i);
//        }
//        if(rev.equals(str)){
//            return true;
//        }
//        return false;
//    }
}
