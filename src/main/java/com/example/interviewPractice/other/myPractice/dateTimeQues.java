package com.example.interviewPractice.other.myPractice;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class dateTimeQues {

//    Write a Java 8 program to calculate the number of
//    days between two dates using the new Date and Time API.Custom Collector

    public static  void main(String[] args){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1= LocalDate.parse("01-09-2024", dateTimeFormatter);
        LocalDate date2= LocalDate.parse("06-10-2024", dateTimeFormatter);
        Period pd = Period.between(date1,date2);
        int diff = pd.getDays();
        int monDiff = pd.getMonths();

        long pdIncluded = ChronoUnit.DAYS.between(date1,date2)+1;
        long pdOneIncluded = ChronoUnit.DAYS.between(date1,date2);
        long pdBothEx = ChronoUnit.DAYS.between(date1,date2)-1;

        System.out.println("days diff:"+diff);
        System.out.println("Months diff:"+monDiff);
        System.out.println("days diff both included:"+pdIncluded);
        System.out.println("days diff one included:"+pdOneIncluded);
        System.out.println("days diff both excluded:"+pdBothEx);
    }
}
