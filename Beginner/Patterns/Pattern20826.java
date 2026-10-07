package Beginner.Patterns;
//Take an integer N as input. Print the following pattern of N lines.
// For N = 5 The following pattern is printed.
//        *     *
//        *    *
//        *   *
//        *  *
//        * *
//The first line has 5 blank spaces between the stars.
//The second line has 4 blank spaces between the stars, and so on.

import java.util.Scanner;

public class Pattern20826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++) {
            System.out.print("*");
            for(int j=1;j<=N-i+1;j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
