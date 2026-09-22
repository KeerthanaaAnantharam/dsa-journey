package Beginner.Patterns;

import java.util.Scanner;

//Write a program to input an integer N from user and
//print hollow inverted right triangle star pattern of N lines using '*'.
//See example for clarifications.
//        N=7
//        *******
//        *    *
//        *   *
//        *  *
//        * *
//        **
//        *
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =1;i<=N;i++) {
            for(int j=i;j<=N;j++) {
                if(i==1 || j==i || j==N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
