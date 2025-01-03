package com.example.interviewPractice.Questions;

import java.util.LinkedHashSet;

public class Ques5 {
    public static void main(String[] args){
        String str = "VIJENDER";
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            lhs.add(str.charAt(i));
        }
        String out = "";
        for(Character ch: lhs){
            out += ch;
        }
        System.out.println(out);
    }
}
