package com.example.interviewPractice.other.epam;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsAPI {
    public static void main(String[] args) {
//    Separate odd and even numbers into two lists.
        int[] arr = {10,20,22,21,11,23};
        var odd = Arrays.stream(arr)
                .filter(x -> x%2 != 0)
                .toArray();
        System.out.println("Odd:"+Arrays.toString(odd));
        var even = Arrays.stream(arr)
                .filter(x -> x%2 == 0)
                .toArray();
        System.out.println("Even:"+Arrays.toString(even));
//    Remove duplicate elements from a list.
        int[] dup = {10,20,22,21,11,23,23,20};
        var rdup = Arrays.stream(dup)
                .distinct()
                .sorted()
                        .toArray();
        System.out.println("Remove Duplicate:"+ Arrays.toString(rdup));
//    Find the frequency of each character in a string.
        String freq = "VIJENDER KUMAR";
//        Map<String, Integer> hm = new HashMap<>();
        var data = freq.chars()
                .mapToObj(e -> (char) e)
                .filter(c -> c!=' ')
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println("FREQUENCY:"+ data);
        System.out.println("Character with Frequency:");
        for(Map.Entry<Character, Long> hm: data.entrySet()){
            System.out.println(hm.getKey()+":"+hm.getValue());
        }
//    Find the frequency of each element in an array or list.
//    Sort a list of decimal numbers in reverse order.
//    Join strings with ‘[’ as a prefix, ‘]’ as a suffix, and ‘,’ as a delimiter.
//    Print numbers from a list that are multiples of 5.
//    Find the maximum and minimum numbers in a list.
//    Merge two unsorted arrays into a single sorted array.
//    Get the three maximum and three minimum numbers from a list.
        int[] a = new int[]{1,2,3,4,10,5,6,7,8,9,9};
        var min = Arrays.stream(a)
                .boxed()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .limit(3)
                .toArray();
        System.out.println("MIN:"+Arrays.toString(min));

        var max = Arrays.stream(a)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .sorted(Comparator.naturalOrder())
                .toArray();
        System.out.println("MAX:"+Arrays.toString(max));

        int[] arrData = new int[]{4,5,9,8,6,-2,3,6};
        var output = Arrays.stream(arrData)
//                .boxed()
                .filter(e -> e>=5)
                .map(sq -> sq*sq)
                .distinct()
                .toArray();
        System.out.println("OUTPUT IS:"+ Arrays.toString(output));

//            Check if two strings are anagrams.
//    Find the sum of all digits of a number.
//    Find the second largest number in an integer array.
        List<Integer> sec = Arrays.stream(a)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                        .toList();
        System.out.println("Second Largest:"+sec);
//    Sort a list of strings by their length.
//    Find the sum and average of all elements in an integer array.
        int[] x = {1,2,3,7,8,9,10,4,5,6};
        var sum = Arrays.stream(x).sum();
        var avg = Arrays.stream(x).average().orElse(0);
        System.out.println(sum+","+avg);

        final var max1 = IntStream.rangeClosed(1, 20)
                .max();
        System.out.println(max1);
//    Find common elements between two arrays.
//    Reverse each word of a string.
//    Find the sum of the first 10 natural numbers.
//    Reverse an integer array.
//    Print the first 10 even numbers.
//    Find the most repeated element in an array.
//    Check if a string is a palindrome.
//    Find strings that start with a number.
//    Extract duplicate elements from an array.
//    Print duplicate characters in a string.
//    Find the first repeated character in a string.
//    Find the first non-repeated character in a string.
//    Generate the Fibonacci series.
//    Print the first 10 odd numbers.
//    Get the last element of an array.
//    Calculate the age of a person given their birthday.
//    Find all even numbers in a list.
//    Find numbers starting with 1 in a list.
//    Find duplicate elements in a list.
//    Find the first element of a list.
//    Find the total number of elements in a list.
//    Find the maximum value in a list.
//    Sort all values in a list.
//    Sort all values in a list in descending order.
//            Check if any value appears at least twice in an array.
//    Get the current date and time using Java 8 Date and Time API.
//    Perform cube on list elements and filter numbers greater than 50.
//    Sort an array and convert it into a Stream.
//    Convert objects into uppercase using the map.
//    Convert a list of objects into a sorted map with duplicated keys.
//    Count each element/word from a String ArrayList.
//    Find duplicate elements with their count from a String ArrayList.
//    Check if a list is empty using Optional and if not, iterate and print the objects.
//    Find the maximum element in an array.
    }
}
