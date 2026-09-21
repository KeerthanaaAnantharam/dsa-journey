package Beginner.Patterns;
//Take an integer N as input, print the corresponding pattern for N.
//For example if N = 5 then pattern will be like:
//        1
//        1_
//        1_3
//        1_3_
//        1_3_5
//Note : Here '_' represents space for explanation purpose only.
// You have to print space in your code.

import java.lang.*;
import java.util.*;

public class SkipEvenNumbersHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<=N;i++) {
            for(int j=1;j<=i;j++) {
                if(j%2==0) {
                    System.out.print(" ");
                } else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}