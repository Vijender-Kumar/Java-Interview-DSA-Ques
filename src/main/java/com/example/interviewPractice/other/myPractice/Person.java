package com.example.interviewPractice.other.myPractice;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class Person {
    public static void main(String[] args){
        List<PersonData> pd  = new ArrayList<>();
        pd.add(PersonData.builder().name("Vijender").age(25).build());
        pd.add(new PersonData("Rampal", 56));
        pd.add(new PersonData("Anil Kumari", 45));

        for(PersonData data:pd){
            System.out.println(data.getName()+", "+data.getAge());
        }
        var ndata = pd.stream()
                .sorted(Comparator.comparing(PersonData::getAge))
//                .sorted((u1, u2) -> Integer.compare(u1.getAge(), u2.getAge()))
                .collect(Collectors.toList());
        for(PersonData str: ndata) {
            System.out.println(str.getName()+ " " + str.getAge());
        }

        Thread thread = new Thread(() -> {
            System.out.println("Here in thread" + Thread.currentThread().getName());
        });
        thread.start();

    }

    @Data
    @Builder
    public static class PersonData{
        private String name;
        private Integer age;
    }
}
