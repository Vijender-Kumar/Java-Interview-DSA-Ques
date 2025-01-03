package com.example.interviewPractice.MockInterview;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListPerson {
    public static void main(String[] args){
        List<Person> personList = new ArrayList<>();
        personList.add(Person.builder().name("vijender").age(26).salary(26000).build());
        Person pr = new Person("Vij", 25, 25000);
        personList.add(pr);
        System.out.println(personList);
        String sss = "Vij";

        var data = personList.stream()
                .filter(person -> person.name.contains(sss) || person.salary>26500)
                .collect(Collectors.toList());
        System.out.println(data);
    }

    @Data
    @Builder
    static class Person{
        String name;
        int age;
        int salary;
    }
}
