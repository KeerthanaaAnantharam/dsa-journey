package Beginner.Patterns;
//Given two integers N and M as inputs, print a rectangle of N * M stars.
//For example if N = 3, M = 4 then pattern will be like:
//   ****
//   ****
//   ****

import java.lang.*;
import java.util.*;

public class PrintMatrixOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=1;i<=N;i++) {
            for(int j=1;j<=M;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}