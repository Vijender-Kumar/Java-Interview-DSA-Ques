package com.example.interviewPractice.other.search;

public class interview {
    public static void main(String[] args){
//        try with resuorce
        String str = "programminx";
        String newstr = dupremove(str);
        System.out.println(newstr);
    }

    public static String dupremove(String str){
        char[] ch = str.toCharArray();
        if(ch.length <2){
            return str;
        }
        int index =1;
        for(int i=1;i< ch.length;i++){
            int j;
            for(j=0;j<index;j++){
                if(ch[i] == ch[j]){
                    break;
                }
            }
            if(j == index){
                ch[index] = ch[i];
                index++;
            }
        }
        return new String(ch, 0, index);
    }
}
