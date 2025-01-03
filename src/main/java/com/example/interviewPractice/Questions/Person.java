package com.example.interviewPractice.Questions;


import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person{
    public static void main(String[] args){
        List<PersonData> personDataList = new ArrayList<>();
        personDataList.add(PersonData.builder().name("Vijender").age(26).salary(95000).dept("Tech").build());
        PersonData pd = new PersonData("Viju", 27, 90000, "IT");
        PersonData pd1 = new PersonData("Vicky", 28, 90000, "Tech");
        PersonData pd2 = new PersonData("Usha", 26, 80000, "IT");
        PersonData pd3 = new PersonData("Tushar", 27, 70000, "IT");
        personDataList.add(pd);
        personDataList.add(pd1);
        personDataList.add(pd2);
        personDataList.add(pd3);
        System.out.println(personDataList);

        Map<String, IntSummaryStatistics> ageGroup = personDataList.stream()
                .collect(Collectors.groupingBy(
                        PersonData::getDept,
                        Collectors.summarizingInt(PersonData::getAge)));
        ageGroup.entrySet().forEach(e -> System.out.println(e.getKey()+":"+e.getValue().getSum()));
    }

    @Data
    @Builder
    public static class PersonData{
        String name;
        int age;
        int salary;
        String dept;
    }
}

