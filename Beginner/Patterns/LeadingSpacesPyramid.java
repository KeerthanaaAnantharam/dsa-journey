package Beginner.Patterns;
//Take an integer N as input, print the corresponding pattern for N.
//        For example if N = 5 then pattern will be like:
//        ____*
//        ___**
//        __***
//        _****
//        *****
//        Note : Here '_' represents space for explanation purpose only.
//        You have to print space in your code.


import java.util.Scanner;

public class LeadingSpacesPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=(N-i);j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
