package com.example.interviewPractice.other.myJavaPractice;

import java.util.*;
import java.util.stream.Collectors;

public class mapData {
    public static void main(String[] args){
        List<String> inputList = Arrays.asList("match");
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

        List<Map<String,String>> hm = listOfMap.stream()
                .flatMap(data -> data.entrySet().stream())
                .filter(data -> data.getValue().equals("match"))
                .map(data -> Map.of(data.getKey(), data.getValue()))
                .toList();
        System.out.println("MAP KEY SET:"+hm);

        Map<String, String> hm1 = listOfMap.stream()
                .flatMap(d -> d.entrySet().stream())
                .filter(d -> inputList.contains(d.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("MAP OF KEY VALUE:"+hm1);

    }
}
