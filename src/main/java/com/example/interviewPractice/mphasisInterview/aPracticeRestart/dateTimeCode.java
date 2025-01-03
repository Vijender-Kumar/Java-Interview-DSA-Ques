package com.example.interviewPractice.mphasisInterview.aPracticeRestart;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class dateTimeCode {
    public static void main(String[] args){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate ld = LocalDate.parse("01-11-2024", df);
        LocalDate ld1 = LocalDate.parse("01-12-2024", df);
        Period pd = Period.between(ld,ld1);
        long dayDiff = ChronoUnit.DAYS.between(ld,ld1);
        int monthDiff = pd.getMonths();
        System.out.println("Days Diff:"+dayDiff+",Month Diff:"+monthDiff);

    }
}
