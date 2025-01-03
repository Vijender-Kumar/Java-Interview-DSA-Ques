package com.example.interviewPractice.Questions;

import java.util.HashSet;

public class Ques3 {
    public static void main(String[] args) {
        String str = "vijuuujivstr";
        String ss = "";
        int uLen = 0;
        String uni = "";
        int pLen = 0;
        String pal = "";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                ss = str.substring(i,j);
                System.out.print(ss+" ");
                if(hasUnique(ss) && uLen<=ss.length()){
                    System.out.print("Unique:"+ss+",");
                    uLen = ss.length();
                    uni = ss;
                }
                if(palindrome(ss) && pLen<=ss.length()){
                    System.out.print("Palindrome:"+ss+",");
                    pLen = ss.length();
                    pal = ss;
                }
            }
        }
        System.out.println();
        System.out.println("Max Unique length:"+uLen+", with String:"+ uni);
        System.out.println("Max Palindrome length:"+pLen+", with String:"+ pal);
    }

    public static boolean hasUnique(String ss){
        HashSet<Character> hs = new HashSet<>();
        for(char ch:ss.toCharArray()){
            if(!hs.add(ch)){
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome(String ss){
        int left =0;
        int right = ss.length()-1;
        for(int i=0;i<ss.length();i++){
            if(ss.charAt(left) != ss.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}