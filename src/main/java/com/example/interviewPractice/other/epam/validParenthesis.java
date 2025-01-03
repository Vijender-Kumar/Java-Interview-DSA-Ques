package com.example.interviewPractice.other.epam;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args){
//        String str = "(()[]{}{})";
        String str = "()())";
        Stack<Character> s = new Stack<>();
        boolean b = true;
        for(char ch: str.toCharArray()){
            if(ch == '('){
                s.push(')');
            } else if(ch == '{'){
                s.push('}');
            } else if(ch == '['){
                s.push(']');
            } else if(s.isEmpty() || s.pop() != ch){
                b = false;
            }
        }
        if(b && s.isEmpty()){
            System.out.println("Valid");
        } else{
            System.out.println("Not Valid");
        }


















//        Stack<Character> s = new Stack<>();
//        boolean b = true;
//        for(char c: str.toCharArray()){
//            if(c == '('){
//                s.push(')');
//            } else if (c == '{') {
//                s.push('}');
//            } else if (c == '[') {
//                s.push(']');
//            } else if (s.isEmpty() || s.pop() != c) {
//                b = false;
//            }
//        }
//        if(b && s.isEmpty()){
//            System.out.println("Valid Parenthesis");
//        } else{
//            System.out.println("Not Valid Parenthesis");
//        }
    }
}
