package com.example.interviewPractice.Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostOccurringNumber {

    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 1, 2, 1, 2, 3, 4, 4, 4, 4, 5, 6, 6, 6, 6};

        // HashMap to store occurrences of each number
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Fill the HashMap with occurrences
        for (int data : arr) {
            hm.put(data, hm.getOrDefault(data, 0) + 1);
        }

        // To store the output result
        List<Integer> out = new ArrayList<>();
        int maximum = 0;

        // Find the maximum occurrence value
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (maximum < entry.getValue()) {
                maximum = entry.getValue();
            }
        }

        // Collect all elements with the maximum occurrence
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == maximum) {
                out.add(entry.getKey());
            }
        }

        // Print the result
        System.out.println("Most occurring numbers: " + out);
    }
}
