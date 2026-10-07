package Beginner.Patterns;
//Given an integer N as input, print the corresponding Full Numeric Pyramid pattern for N.
//For example if N = 5 then pattern will be like:
//        0 0 0 0 1 0 0 0 0
//        0 0 0 2 3 2 0 0 0
//        0 0 3 4 5 4 3 0 0
//        0 4 5 6 7 6 5 4 0
//        5 6 7 8 9 8 7 6 5

import java.util.Scanner;

public class FullNumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int width = N*2-1;
        int mid = N-1;
        for(int i=1;i<=N;i++) {
            for(int j=0; j<width;j++) {
                int d = Math.abs(j-mid);
                int value = (d<i) ? (2*i-1)- d : 0;
                if(j>0) {
                    System.out.print(" ");
                }
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
