package com.example.interviewPractice.other.myPractice;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class flatenArray {
    public static void main(String[] args){
        Object[] arr = {1,20, 2, new Object[]{5}, 6, 7, new Object[] {10,15}};

        Object[] f = Arrays.stream(arr)
                .flatMap(ele -> ele instanceof Object[] ? Arrays.stream((Object[]) ele) : Stream.of(ele)).toArray();
        System.out.println(Arrays.toString(f));









        List<List<String>> str = Arrays.asList(
                Arrays.asList("a", "bcdef"),
                Arrays.asList("cdef", "def"),
                Arrays.asList("ef", "f")
        );

        List<String> flta = str.stream()
                        .flatMap(Collection::stream)
                .sorted(Comparator.comparing(String::length).reversed())
                .distinct()
                .toList();
        System.out.println(flta);

        List<Integer> ls = Arrays.asList(1,5,6,45,88,65,3,211,453,54,10);

        final var max = ls.stream()
                .max(Comparator.naturalOrder());
        System.out.println(max.get());


















//        Object[] fltarr = Arrays.stream(arr)
//                .flatMap(ele -> ele instanceof Object[]
//                ? Arrays.stream((Object[]) ele)
//                        : Stream.of(ele))
//                .toArray();
//        System.out.println(Arrays.toString(fltarr));
    }
}
