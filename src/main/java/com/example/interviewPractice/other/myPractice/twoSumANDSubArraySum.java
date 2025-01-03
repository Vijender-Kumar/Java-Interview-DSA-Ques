package com.example.interviewPractice.other.myPractice;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class twoSumANDSubArraySum {
    public static void main(String[] args) {

//        nput: nums = [2, 7, 11, 15], target = 9
//        Output: [0, 1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int target = 7;
//        OUTPUT: [3, 4]
//          [3, 4, -7, 1, 3, 3]
//          [1, 3, 3]
//          [3, 3, 1]
//        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
//        int target = 7;

//        int[] arr = {9, 3, 8, 2, 7, 11, 15};
//        int target = 12;


//        int[] arr = {9, 3, 8, 2, 7, 11, 15};
//        int target = 13;
        List<List<Integer>> nl = new ArrayList<>();

        for(int i=0;i< arr.length;i++){
            List<Integer> f = new ArrayList<>();
            int sum =0;

            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                f.add(arr[j]);

                if(sum == target){
                    nl.add(new ArrayList<>(f));
                }
            }
        }

        for(List<Integer> out:nl) {
            System.out.println(out);
        }

        List<List<Integer>> ls = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int sum=0;
            List<Integer> fin = new ArrayList<>();
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                fin.add(arr[j]);

                if(sum == target){
                    ls.add(new ArrayList<>(fin));
                }
            }
        }
        for(List<Integer> lst: ls) {
            System.out.println(lst);
        }

    }
















//        List<List<Integer>> ls = new ArrayList<>();
//
//        for(int i=0; i< arr.length;i++){
//            int sum =0;
//            List<Integer> data = new ArrayList<>();
//            for(int j=i; j<arr.length;j++){
//                sum += arr[j];
//                data.add(arr[j]);
//
//                if(sum == target){
//                    ls.add(new ArrayList<>(data));
//                }
//            }
//        }

//        for(List<Integer> res: ls){
//            System.out.println(res);
//        }
//
//    }





//        int[] data = {9, 3, 8, 2, 7, 11, 15};
//        int target = 9;
//
//        int[] result = twoSum(data, target);
//
//        if(result.length == 2){
//            log.info("This is the index for target:[{}], [{}]", result[0], result[1]);
//        } else{
//            log.info("Sum not found");
//        }
//
//    }
//
//    public static int[] twoSum(int[] data, int target) {
//        for (int i = 0; i < data.length; i++) {
//            for (int j = i + 1; j < data.length; j++) {
//                if (data[i] + data[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

}
