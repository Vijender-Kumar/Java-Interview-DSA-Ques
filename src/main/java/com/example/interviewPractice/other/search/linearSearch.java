package com.example.interviewPractice.other.search;

public class linearSearch {
    public static void main(String[] args){
        int[][] ls = {
                {1,2,3,4},
                {9,10,11,15},
                {14,56,223,300}
        };
        int target = 223;
        boolean found = false;
        boolean nFound = false;
        for(int i=0;i< ls.length;i++){
            for(int j=0;j<ls[i].length;j++){
                if(ls[i][j] == target){
                    System.out.println("This is the Row:"+i+", Col:"+j);
                    found=true;
                }
            }
        }
        int row = 1;
        for(int[] num: ls){
            int col = 1;
            for(int n: num){
                if(n == target){
                    System.out.println("This is the Row:"+row+", Col:"+col);
                    nFound=true;
                }
                col++;
            }
            row++;
        }
        if(found && nFound){
            System.out.println("This data is the Found");
        } else{
            System.out.println("This data is not Found");
        }
    }
}
