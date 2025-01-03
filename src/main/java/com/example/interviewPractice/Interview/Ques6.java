package com.example.interviewPractice.Interview;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ques6 {
    public static void main(String[] args) throws IOException {
        String fl = "My Name is Vijender Kumar. This is for Testing File. \nData is Present in the file";
        String find = "for";
        String filePath = "C:\\Users\\Vijender Kumar\\Documents\\1 Personal VIJENDER\\Personal Codes\\InterviewQuestionsCoding\\src\\main\\resources\\vijender.txt";
        byte[] fileContent = Files.readAllBytes(Paths.get(filePath));

        ByteArrayInputStream bs = new ByteArrayInputStream(fileContent);
        String fileData = new String(bs.readAllBytes());
        System.out.println(fileData);
        if(fileData.contains(find)){
            System.out.println("Data found at:"+fileData.indexOf(find));
        }

//        String str = "My names is Vijender Kumar";
//        String vow = "xyzqwrta";
//        String find = "der";
//
//        vow.chars()
//                .mapToObj(c -> (char) c)
//                .filter(c -> "AEIOUaeiou".contains(c.toString()))
//                .forEach(System.out::println);
//
//        var data = Arrays.stream(str.split(" "))
//                .filter(s -> s.contains(find))
//                .peek(s -> System.out.println("Found word:"+s+", Word to Find:"+find))
//                .collect(Collectors.toList());
//        System.out.println(data);
//
//        str.chars()
//                .mapToObj(c -> (char) c)
//                .filter(c -> find.contains(c.toString()))
//                .forEach(System.out::println);
    }
}
