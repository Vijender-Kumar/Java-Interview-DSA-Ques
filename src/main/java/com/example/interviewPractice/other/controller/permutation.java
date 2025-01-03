package com.example.interviewPractice.other.controller;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class permutation {
    @Data
    @Builder
    public static class EmployeeData{
        private String name;
        private int age;
        private int salary;
    }
    public static void Perm(String str, String resp){
        if(str.isEmpty()){
            System.out.println(resp);
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String perm = str.substring(0,i)+str.substring(i+1);
            Perm(perm, resp+ch);
        }
    }
    public static void main(String[] args) {

        String str = "abc";

        Perm(str, "");

//        List<EmployeeData> ed = new ArrayList<>();
//        ed.add(new EmployeeData("Vijender", 26, 85000));
//        ed.add(new EmployeeData("Viju", 27, 76000));
//
//        var out = ed.stream()
//                        .filter(salary -> salary.getSalary() >78000)
//                .collect(Collectors.groupingBy(EmployeeData::getSalary));
//        System.out.println(out);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String:");
//        String str = sc.nextLine();
//        Permut(str, "");
    }




















//        PermutationString(str, "");
//        List<String> ls = PermutationStr(str);
//        System.out.println("Total data:"+ls.size());
//        for(String permuation:ls){
//            System.out.println(permuation);
//        }
//    }
//    public static List<String> PermutationStr(String str){
//        List<String> output = new ArrayList<>();
//        if(str.isEmpty()){
//            output.add("");
//            return output;
//        }
//
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            String perm = str.substring(0,i) + str.substring(i+1);
//
//            List<String> data = PermutationStr(perm);
//            for(String l:data){
//                output.add(ch+l);
//            }
//        }
//        return output;
//    }
//
//    public static void PermutationString(String str, String resp){
//        if(str.isEmpty()){
//            System.out.println(resp);
//        }
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            String per = str.substring(0,i)+ str.substring(i+1);
//            PermutationString(per, resp+ch);
//        }
//    }
}
