package com.example.interviewPractice.Questions;

public class Ques1 {
    public static void main(String[] args){
        String str = "Rahul is good Coder";
        String[] data = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<data.length;i++){
            String rev = new StringBuilder(data[i]).reverse().toString();
            sb.append(rev).append(" ");
        }
        System.out.println(sb.toString());
    }
}
