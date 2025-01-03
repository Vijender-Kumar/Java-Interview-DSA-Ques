package com.example.interviewPractice.Interview;

public class  Ques2 {
    public static void main(String[] args) {
//        Str = “ACBCCBCBA”
//        ACBBCBA ACCBA ABA

        String str1 = "ACBCCBXXCBA";
        String fin = isAdjDup(str1);
        System.out.println("After removing the adjacent duplicates:"+ fin);

        int n = 7;
        boolean b = prime(n);
        System.out.println("is prime:"+b);
    }

//    public static String isAdjDup(String str){
//        boolean found = true;
//        StringBuilder sb = new StringBuilder(str);
//        while(found){
//            found = false;
//            for(int i=1;i<sb.length();i++) {
//                if (sb.charAt(i) == sb.charAt(i - 1)) {
//                    sb.delete(i - 1, i + 1);
//                    found = true;
//                    break;
//                }
//            }
//        }
//        String fin = sb.toString();
//        System.out.println(fin);
//        return fin;
//    }

//    public static String isAdjDup(String str){
//        boolean found = true;
//        while(found){
//            found = false;
//            StringBuilder sb = new StringBuilder();
//            for(int i=0;i<str.length();i++) {
//                if (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                    found = true;
//                    i++;
//                } else{
//                    sb.append(str.charAt(i));
//                }
//            }
//            str = sb.toString();
//        }
//        System.out.println(str);
//        return str;
//    }

    public static String isAdjDup(String str){
        boolean found = true;
        StringBuilder sb = new StringBuilder(str);
        while(found){
            found =false;
            for(int i=1;i<sb.length();i++){
                if(i<sb.length()-1 && sb.charAt(i) == sb.charAt(i-1)){
                    sb.delete(i-1, i+1);
                    found = true;
                    i++;
                }
            }
        }
        return sb.toString();
    }

    public static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
