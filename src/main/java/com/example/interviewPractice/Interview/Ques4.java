package com.example.interviewPractice.Interview;

import java.util.Stack;

public class Ques4 {
    public static void main(String[] args){
//        String str = "AXBCBCCBCA";
        //output = A, "AXBCCXCCXA" - AXBXCCXA - AXBXXA - AXBA(final)
//        String str = "AAXXBBBBCCBXX"; remove one duplicate only from consecutive duplicates
//        output: AXBCBX

        String str = "AAXXBBJJBBCCBXX";
//        remove one duplicate only from consecutive duplicates
//        output: AXBCBX
        //Your code goes here
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()){
            if(stack.isEmpty() || stack.peek() != ch){
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: stack){
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}











    //output = A, "AXBCCXCCXA" - AXBXCCXA - AXBXXA - AXBA(final)
    //Your code goes here
//    boolean found = true;
//        while (found) {
//                found = false;
//                StringBuilder sb = new StringBuilder();
//
//                for (int i = 0; i < str.length(); i++) {
//        if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//        found = true;
//        i++;
//        } else {
//        sb.append(str.charAt(i));
//        }
//        }
//        str = sb.toString();
//        }
//
//        // Final result after all consecutive duplicates are removed
//        System.out.println("Final result: " + str);

//USING THE STACK
//        String str = "AAXXBBBBCCBXX"; remove one duplicate only from consecutive duplicates
//        output: AXBCBX
//Stack<Character> st = new Stack<>();

//USE THIS LOOP
//        for(int i=0;i<str.length();i++){
//        if(!st.isEmpty() && st.peek() == str.charAt(i)){
//        st.pop();
//        } else{
//        st.push(str.charAt(i));
//        }
//        }

////OR USE BELOW FOR LOOP
//for(int i=0;i<str.length();i++){
//        if(st.isEmpty() || st.peek() != str.charAt(i)){
//        st.push(str.charAt(i));
//        }
//        }
//        StringBuilder sb = new StringBuilder();
//        for(char ch:st){
//        sb.append(ch);
//        }
//        System.out.println(sb.toString());