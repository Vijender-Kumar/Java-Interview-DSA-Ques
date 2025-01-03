package com.example.interviewPractice.MockInterview;

public class Ques1 {
    public static void main(String[] args) {
//        try{
//            int i = 1290;
//            int x = i/0;
//            System.out.println(x);
//        } catch(NullPointerException e){
//            throw new NullPointerException("Error in Null Pointer");
//        } catch(ArithmeticException e){
//            throw new ArithmeticException("Error in Arithmetic");
//        }
//        Input: s = "aeiou", k = 2
//        Output: 2
//        Explanation: Any substring of length 2 contains 2 vowels.
//                Example 3:
//        Input: s = "aeiou", k = 2
//        Output: 2
//        Explanation: Any substring of length 2 contains 2 vowels.
        String str = "abciiidef";
        String ss = "";
        int cnt = 0;
        int subString = 3;
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                ss = str.substring(i,j);
                if(ss.length()== subString) {
                    System.out.print(ss + ":");
                    cnt = Math.max(isVowels(ss), cnt);
                }
            }
        }
        System.out.println("Max value is:"+ cnt);
        String vow = "aeiou";
        char[] ch = str.toCharArray();
        int left =0;
        int right = str.length()-1;
        String out ="";
        while(left<right){
            while(vow.indexOf(ch[left]) == -1){
                left++;
            }
            while(vow.indexOf(ch[right]) == -1){
                right--;
            }
            if(left<right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            out = new String(ch);
        }
        System.out.println(out);
    }
    public static int isVowels(String ss){
        String vow = "aeiou";
        int count =0;
        for(int i=0;i<ss.length();i++){
            if(vow.contains(String.valueOf(ss.charAt(i)))){
                count++;
            }
        }
        return count;
    }
}
