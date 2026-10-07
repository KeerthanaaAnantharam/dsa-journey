package Beginner.Patterns;
//Take an integer N as input, print the corresponding pattern for N.
//For example if N = 5 then pattern will be like:
//        *________* // 8 spaces
//
//        **______** // 6 spaces
//
//        ***____*** // 4 spaces
//
//        ****__**** // 2 spaces
//
//        ********** // 0 spaces
//NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.

import java.util.Scanner;

public class HollowInvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=1;j<=2*(N-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
