package com.example.interviewPractice.other.myPractice;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class reverseWords {
    public static void main(String[] args){
        String input = "rahul is a good boy and a boy";
        String[] sp = input.split(" ");
        StringBuilder str = new StringBuilder();
        for(String word: sp){
            String rev = new StringBuilder(word).reverse().toString();
            str.append(rev).append(" ");

        }
        System.out.println(str.toString().trim());

//        StringBuilder str = new StringBuilder();
//        StringBuilder str1 = new StringBuilder();
////        for(String r: sp){
////            str.append(new StringBuilder(r).reverse().append(" "));
////        }
////        System.out.println(str.toString().trim());
//        for(String r:sp){
//            String s = "";
//            char[] ch = r.toCharArray();
//            for(int i=ch.length-1;i>=0;i--){
//                s += ch[i];
//            }
//            str.append(s).append(" ");
//        }
//        System.out.println(str.toString().trim());
//
//        for(int i=sp.length-1;i>=0;i--){
//            str1.append(sp[i]).append(" ");
//        }
//        System.out.println(str1.toString().trim());

    }
}
