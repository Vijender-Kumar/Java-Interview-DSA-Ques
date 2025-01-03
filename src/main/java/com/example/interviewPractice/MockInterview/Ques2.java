package com.example.interviewPractice.MockInterview;

import java.util.HashSet;
import java.util.Set;

public class Ques2 {
    public static void main(String[] args){
        String str = "NAMAN";
        String ss = "";
        int max = 0;
        int pLen = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                ss = str.substring(i,j);
                System.out.print(ss+" ");
                if(hasUnique(ss) && max<ss.length()){
                    System.out.print(ss+",");
                    max = ss.length();
                }
                if(palindrom(ss) && max<ss.length()){
                    System.out.println(ss+":");
                    pLen = Math.max(ss.length(), pLen);
                }
            }
        }
        System.out.println("Max Length of Unique is:"+max);
        System.out.println("Max Length of Palindrome is:"+pLen);
    }

    public static boolean hasUnique(String ss){
        char[] ch = ss.toCharArray();
        Set<Character> hs = new HashSet<>();
        for(char c:ch){
            if(!hs.add(c)){
                return false;
            }
        }
        return true;
    }

    public static boolean palindrom(String ss){
        char[] ch = ss.toCharArray();
        int left = 0,right=ss.length()-1;
        while(left<right){
            if(ch[left] != ch[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
