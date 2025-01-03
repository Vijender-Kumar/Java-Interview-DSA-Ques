package com.example.interviewPractice.other.controller;

public class islandProblem {
    public static void main(String[] args){
        int[][] arr = new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 1}
        };

//        int[][] vis = new int[][] {
//                {0, 0, 0},
//                {0, 0, 0},
//                {0, 0, 0},
//                {0, 0, 0}
//        };

        int count =0;
        int maxArea = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j] == 1){
                    int area = dfss(i,j,arr);
                    maxArea = Math.max(maxArea, area);
                    dfs(i,j,arr);
                    count++;
                }
            }
        }
        System.out.println("Total Island:"+count+", Max Area:"+maxArea);

    }

    public static void dfs(int row, int col, int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        if(row<0 || col <0 || row>= rows || col>=cols || arr[row][col] == 0){
            return;
        }

        arr[row][col] = 0;
        dfs(row+1, col, arr);
        dfs(row-1, col, arr);
        dfs(row, col+1, arr);
        dfs(row, col-1, arr);
    }

    public static int dfss(int row, int col, int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        if(row<0 || col <0 || row>= rows || col>=cols || arr[row][col] == 0){
            return 0;
        }
        int size =1;

        arr[row][col] = 0;
        size += dfss(row+1, col, arr);
        size += dfss(row-1, col, arr);
        size += dfss(row, col+1, arr);
        size += dfss(row, col-1, arr);

        return size;
    }
}
