//package com.example.interviewPractice.Interview;
//
//import java.util.Arrays;
//
//public class DuplicateinArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 5, 6, 2, 2, 2, 4, 5, 6};
//        int n = arr.length;
//
//        // If array is empty or has only one element
//        if (n == 0 || n == 1) {
//            System.out.println("Array length: " + n);
//            return;
//        }
//
//        // Sort the array to bring duplicates together
//        Arrays.sort(arr);
//        int index = 1;
//        for (int i = 1; i < n; i++) {
//            if (arr[i] != arr[i - 1]) {  // Only store unique elements
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//
//
//        // Initialize the index of the next unique element
////        int j = 0;
////
////        // Iterate through the array
////        for (int i = 1; i < n; i++) {
////            if (arr[i] != arr[j]) {
////                j++;
////                arr[j] = arr[i];
////            }
////        }
////
////        // Output the unique elements
//        System.out.println("Array without duplicates: ");
//        for (int i = 0; i <= index; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

package com.example.interviewPractice.Interview;

import java.util.Arrays;

public class DuplicateinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 2, 2, 2, 4, 5, 6};
        int n = arr.length;

        // If array is empty or has only one element
        if (n == 0 || n == 1) {
            System.out.println("Array length: " + n);
            return;
        }

        // Sort the array to bring duplicates together
        Arrays.sort(arr);
        int index = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {  // Only store unique elements
                arr[index] = arr[i];
                index++;
            }
        }

        // Output the unique elements
        System.out.println("Array without duplicates: ");
        for (int i = 0; i < index; i++) {  // Loop should go till index - 1
            System.out.print(arr[i] + " ");
        }
    }
}
