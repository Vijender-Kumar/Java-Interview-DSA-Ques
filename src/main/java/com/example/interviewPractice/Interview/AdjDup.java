package com.example.interviewPractice.Interview;

import java.util.HashSet;
import java.util.Set;

public class AdjDup {
    public static void main(String[] args){
        String data = "XBCDDCBXAZMB";
        String ss = "";
        String maxPal = "";
        int maxPalindrome = 0;
        String maxUni = "";
        int maxUnique = 0;
        for(int i=0;i<data.length();i++){
            for(int j=i+1;j<=data.length();j++){
                ss = data.substring(i,j);
                if(palindrome(ss) && maxPalindrome<=ss.length()){
                    maxPalindrome = ss.length();
                    maxPal = ss;
                }
                if(unique(ss) && maxUnique<=ss.length()){
                    maxUnique = ss.length();
                    maxUni = ss;
                }
            }
        }
        System.out.println("Max Palindrome:"+maxPal+", with length:"+maxPalindrome);
        System.out.println("Max Unique:"+maxUni+", with length:"+maxUnique);
    }

    public static boolean palindrome(String ss){
        int left = 0;
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

    public static boolean unique(String ss){
        Set<Character> hs = new HashSet<>();
        for(char ch: ss.toCharArray()){
            if(!hs.add(ch)){
                return false;
            }
        }
        return true;
    }
}
