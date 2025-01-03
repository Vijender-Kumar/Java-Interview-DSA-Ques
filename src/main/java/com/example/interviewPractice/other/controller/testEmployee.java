package com.example.interviewPractice.other.controller;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class testEmployee {
    public static void main(String[] args){
        List<EmpData> ls = new ArrayList<>();
        ls.add(new EmpData("Vijender", 101, 90000));
        ls.add(new EmpData("Arjit", 103, 100000));
        ls.add(new EmpData("Pradeep", 102, 95000));

       var list = ls.stream()
               .filter(x -> x.salary >85000)
               .collect(Collectors.groupingBy(EmpData::getSalary));
       System.out.println(list);
    }

    @Data
    @Builder
    public static class EmpData{
        private String name;
        private int id;
        private int salary;
    }
}
