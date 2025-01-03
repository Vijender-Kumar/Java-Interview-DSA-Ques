package com.example.interviewPractice.other.myJavaPractice;

import java.util.Arrays;

public class palindrome {
    public static void main(String[] args){
        //plaindrome check
        String str = "naman";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        StringBuilder s = new StringBuilder();

        int i=0;
        while( i< ch.length){
            char curr = ch[i];
            int count =0;

            while(i< ch.length && ch[i] == curr){
                i++;
                count++;
            }
            if(count>1) {
                s.append(curr);
                s.append(count);
            } else{
                s.append(curr);
            }
            System.out.println("COUNT OF:"+curr+" is:"+count);
        }
        System.out.println("Final String:"+s);




        int left =0;
        int right = ch.length-1;
        boolean b = true;
        while(left< right){
            if (str.charAt(left) != str.charAt(right)){
                 b = false;
                 break;
            }
            left++;
            right--;
        }
        if(b){
            System.out.println("Palindrome:"+ b);
        } else{
            System.out.println("Palindrome:"+ b);
        }
    }
}
