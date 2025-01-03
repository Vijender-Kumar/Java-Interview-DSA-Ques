package com.example.interviewPractice.Interview;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ques5{
    public static void main(String[] args) throws IOException {
        //Write your code here.
//        String[] data = {"eat","tea","tan","ate","nat","bat"};

        String filePath = "C:/Users/Vijender Kumar/Documents/1 Personal VIJENDER/Personal Codes/InterviewQuestionsCoding/src/main/resources/vijender.txt";
        String find = "file";

        byte[] fileData = Files.readAllBytes(Paths.get(filePath));

        ByteArrayInputStream br = new ByteArrayInputStream(fileData);
        String fileContent = new String(br.readAllBytes());
        System.out.println(fileContent);
        if(fileContent.contains(find)){
            System.out.println("Data Found at index:"+fileContent.indexOf(find));
        } else{
            System.out.println("No Data Found");
        }
    }
}