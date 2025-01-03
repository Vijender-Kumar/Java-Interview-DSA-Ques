package com.example.interviewPractice.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ques4 {
    public static void main(String[] args) {
        String str = "abcd";
        String find = "cab";
    }

























//        List<String> permut = perm(str, "");
//        System.out.println(permut);
//        Optional<List<String>> ls = Optional.of(permut.stream()
//                .filter(data -> data.contains(find))
//                .collect(Collectors.toList()));
//        System.out.println(ls.get());
//    }
//
//    public static List<String> perm(String str, String resp){
//        List<String> per = new ArrayList<>();
//        if(str.isEmpty()){
//            per.add(resp);
//            return per;
//        }
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            String perm = str.substring(0,i)+str.substring(i+1);
//            per.addAll(perm(perm, resp+ch));
//        }
//        return per;
//    }
}
