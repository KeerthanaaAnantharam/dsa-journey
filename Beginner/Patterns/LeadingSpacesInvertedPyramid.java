package Beginner.Patterns;

import java.util.Scanner;

//Take an integer N as input, print the corresponding pattern for N.
//  For example if N = 3 then pattern will be like:
//  ***
//  _**
//  __*
public class LeadingSpacesInvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<=N;i++) {
            for(int j=1;j<=i-1;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=N-i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
