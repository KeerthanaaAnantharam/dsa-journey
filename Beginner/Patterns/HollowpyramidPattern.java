package Beginner.Patterns;

//Take an integer N as input, print the corresponding pattern for N.
//        For example if N = 5 then pattern will be like:
//        ********** // 0 spaces
//        ****__**** // 2 spaces
//        ***____*** // 4 spaces
//        **______** // 6 spaces
//        *________* // 8 spaces
//        NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.

import java.util.Scanner;

public class HollowpyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=(N-i+1);j++) {
                System.out.print("*");
            }
            for(int j=1;j<2*(i-1);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(N-i+1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
