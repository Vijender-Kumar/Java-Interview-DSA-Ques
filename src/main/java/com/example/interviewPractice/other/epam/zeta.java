package com.example.interviewPractice.other.epam;

import java.io.OutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class zeta {

//    1. Given an unsorted array of integers, find the third largest number in the array. If the array has less than three distinct numbers, return the largest number.
//            Example:
//    Input:
//    arr = [2, 4, 1, 5, 3, 6]
//    Output:
//            4
//    Explanation:
//    The sorted array in descending order is [6, 5, 4, 3, 2, 1]. The third largest number is 4.
//
//            2. Given an array of strings, group the strings that are anagrams of each other.
//            Example:
//    Input:
//    arr = ["eat", "tea", "tan", "ate", "nat", "bat"]
//    Output:
//            [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
//    Explanation:
//    The groups of anagrams are ["eat", "tea", "ate"], ["tan", "nat"], and ["bat"].
//
//            3. Given an array of integers, find the largest number that does not have any duplicates in the array.
//            Example:
//    Input:
//    arr = [4, 3, 2, 7, 3, 4, 8]
//    Output:
//            8
//    Explanation:
//    The unique numbers are [2, 7, 8], and the largest among them is 8.
    public static void main(String[] args) {
//        int[] arr = {4, 3, 2, 7, 3, 4, 8};
//        Set<Integer> s = new HashSet<>();
//        for(int i=0;i<arr.length;i++){
//            s.add(arr[i]);
//        }
//        System.out.println(s);
//        var output = s.stream()
//                .max((u1,u2) -> u1.compareTo(u2))
//                .orElse(null);
//        System.out.println(output);
//        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        Map<String, List<String>> ls = new HashMap<>();
//        for(String s:str){
//            char[] ch = s.toCharArray();
//            Arrays.sort(ch);
//            String data = new String(ch);
//
//            ls.computeIfAbsent(data, ele -> new ArrayList<>()).add(s);
//        }
//        ls.values().forEach(System.out::println);
//        int[] arr = {2, 4, 1, 5, 3, 6,6};
//
//        var output = Arrays.stream(arr)
//                .boxed()
//                .sorted(Comparator.reverseOrder())
//                .map(Integer::intValue)
//                .distinct()
//                .limit(3)
//                .skip(2)
//                .toArray();
//        System.out.println(Arrays.toString(output));
    }

}
