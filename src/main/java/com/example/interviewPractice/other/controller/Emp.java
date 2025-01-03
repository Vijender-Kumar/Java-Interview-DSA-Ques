package com.example.interviewPractice.other.controller;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emp {
    public static void main(String[] args){
        List<EmpData> ls = new ArrayList<>();
        ls.add(new EmpData("Vijender", 1001, 95000));
        ls.add(new EmpData("Rohit", 1002, 85000));
        ls.add(new EmpData("Usha", 1003, 90000));

        var data = ls.stream()
                        .filter(e -> e.getSalary()>89000)
                                        .collect(Collectors.groupingBy(EmpData::getSalary));

        System.out.println(data);
    }

    @Data
    @Builder
    public static class EmpData{
        private String name;
        private int id;
        private int salary;
    }
}

//public class Emp {
//    public static void main(String[] args) {
//        int sum = sum(1, 2, 3, 4, 5);
//        System.out.println(sum);
//    }
//
//    public static int sum(int... a){
//        int r =0;
//        for(int i : a ) r = r + i;
//        return r;
//    }
//}
