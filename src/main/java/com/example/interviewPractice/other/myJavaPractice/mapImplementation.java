package com.example.interviewPractice.other.myJavaPractice;

import java.util.*;
import java.util.stream.Collectors;

public class mapImplementation {
    public static void main(String[] args){
        List<String> inputList = Arrays.asList("match", "math");
        List<Map<String, String>> listOfMap = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("key1","something");

        Map<String, String> map2 = new HashMap<>();
        map2.put("key4","something");

        Map<String, String> map3 = new HashMap<>();
        map3.put("key8","match");
        map3.put("key9","math");

        listOfMap.add(map1);
        listOfMap.add(map2);
        listOfMap.add(map3);

        System.out.println("LIST OF MAP:"+listOfMap);

        List<Map<String, String>> lsm = listOfMap.stream()
                .flatMap(data -> data.entrySet().stream())
                .filter(data -> inputList.contains(data.getValue()))
                .map(data -> Map.of(data.getKey(), data.getValue()))
                .toList();
        System.out.println("LSM:"+lsm);

        Map<String,String> mlsm = listOfMap.stream()
                .flatMap(data -> data.entrySet().stream())
                .filter(data -> inputList.contains(data.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        List<Map<String, String>> str = listOfMap.stream()
                .filter(data -> data.containsValue("match"))
                .toList();
        System.out.println("Match Data:"+str);

        List<Map.Entry<String, String>> str1 = listOfMap.stream()
                .flatMap(data -> data.entrySet().stream())
                .filter(map -> inputList.contains(map.getValue()))
                .toList();

        System.out.println("Flatmap Output:"+str1);

        List<Map<String,String>> str2 = listOfMap.stream()
                .flatMap(data -> data.entrySet().stream())
                .filter(map -> inputList.contains(map.getValue()))
                .map(map -> Map.of(map.getKey(), map.getValue()))
                .toList();

        System.out.println("Flatmap Output in map:"+str2);

        Map<String, String> str3 = listOfMap.stream()
                .flatMap(data -> data.entrySet().stream())
                .filter(map -> inputList.contains(map.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Output in map:"+str3);
    }
}


