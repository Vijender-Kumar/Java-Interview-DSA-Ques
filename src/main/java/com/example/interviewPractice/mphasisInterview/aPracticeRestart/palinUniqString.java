package com.example.interviewPractice.mphasisInterview.aPracticeRestart;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class palinUniqString {
    public static void main(String[] args) {
        String str = "VIJENDER KUMAR";
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(char ch:str.toCharArray()){
            if(!hs.add(ch)){
                sb.append(ch);
            }
            System.out.print(hs+", ");
        }

        System.out.println("Repeated characters are:"+sb.toString());
    }
}
