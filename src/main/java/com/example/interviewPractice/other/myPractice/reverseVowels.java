package com.example.interviewPractice.other.myPractice;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class reverseVowels {

    //    Given a string s, reverse only all the vowels in the string and return it.
//
//    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//    Example 1:
//
//    Input: s = "hello"
//    Output: "holle"
//    Example 2:
//
//    Input: s = "leetcode"
//    Output: "leotcede"
    public static void main(String[] args) {
        String word = "LiItcodE";
        String vowels = "AEIOUaeiou";
        char[] ch = word.toCharArray();
        int left=0;
        int right =ch.length-1;
        while(left<right){
            if(left<right && vowels.indexOf(ch[left]) == -1){
                left++;
            }
            if(left<right && vowels.indexOf(ch[right]) == -1){
                right--;
            }
            if(left<right){
                char c = ch[left];
                ch[left]= ch[right];
                ch[right] = c;
                left++;
                right--;
            }
        }
        System.out.println(new String(ch));



//        int left = 0;
//        int right = ch.length - 1;
//        while (left < right) {
//            if (left < right && vowels.indexOf(ch[left]) == -1) {
//                left++;
//            }
//            if (left < right && vowels.indexOf(ch[right]) == -1) {
//                right--;
//            }
//            if(left<right){
//                char temp = ch[left];
//                ch[left] = ch[right];
//                ch[right] = temp;
//                left++;
//                right--;
//            }
//        }
//
//        System.out.println(new String(ch));
    }
}
