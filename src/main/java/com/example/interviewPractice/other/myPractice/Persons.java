package com.example.interviewPractice.other.myPractice;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Persons {
//    Write a Java 8 program that uses a lambda expression to
//    sort a list of Person objects by their last names.Streams API
    public static void main(String[] args){
        List<PersonDataValue> pd= new ArrayList<>();
        pd.add(PersonDataValue.builder().firstName("Vijender").lastName("Kumar").build());
        pd.add(PersonDataValue.builder().firstName("Vij").lastName("Singh").build());
        pd.add(PersonDataValue.builder().firstName("Vij").lastName("Anant").build());

        final var lastNameSorted = pd.stream()
                .sorted(Comparator.comparing(PersonDataValue::getLastName))
                .toList();

        System.out.println("data after Sorting::::"+ lastNameSorted);

    }

    @Data
    @Builder
    public static class PersonDataValue{
        String firstName;
        String lastName;
    }
}
