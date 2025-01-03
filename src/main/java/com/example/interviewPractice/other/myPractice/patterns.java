package com.example.interviewPractice.other.myPractice;

public class
patterns {
    public static void main(String[] args) {
//                      A
//                  A	      B
//              A         B          C
//         A           B          C           D
//    A           B          C          D            E

        char c = 'A';
        int n = 5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char) (c + j - 1));
            }
            System.out.println();
        }

//           ****
//          ****
//         ****
//        ****
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//           ******
//           *    *
//           *    *
//           ******

        int len=4, b=5;
        for(int i=1;i<=len;i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == len || j == 1 || j == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

//            1
//           212
//          32123
//         4321234
//        543212345

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

//            1
//           121
//          12321
//         1234321
//        123454321

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
