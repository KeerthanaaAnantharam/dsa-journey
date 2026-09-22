package Beginner.Patterns;
//Given an integer N, print the corresponding Inverted Half Pyramid pattern for N.
//For example if N = 4 then pattern will be like:
//        ****
//        ***
//        **
//        *

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=N-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
