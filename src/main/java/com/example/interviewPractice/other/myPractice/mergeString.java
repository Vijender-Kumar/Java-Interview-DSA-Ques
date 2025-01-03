package com.example.interviewPractice.other.myPractice;

public class mergeString {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "xyz";

        String result = mergeStrings(word1, word2);
        System.out.println("Merged String: " + result);
    }

    public static String mergeStrings(String w1, String w2) {
        int n1 = w1.length();
        int n2 = w2.length();
        int max = Math.max(n1,n2);
        StringBuilder str = new StringBuilder();
        for(int i=0;i<max;i++){
            if(i<n1){
                str.append(w1.charAt(i));
            }
            if(i<n2){
                str.append(w2.charAt(i));
            }
        }
        return str.toString();
    }
















//        StringBuilder sb = new StringBuilder();
//        int l1 = wrd1.length();
//        int l2 = wrd2.length();
//        int max = Math.max(l1, l2);
//
//        for(int i=0;i<max;i++){
//            if(i<l1){
//                sb.append(wrd1.charAt(i));
//            }
//            if(i<l2){
//                sb.append(wrd2.charAt(i));
//            }
//        }
//        return sb.toString();

}
