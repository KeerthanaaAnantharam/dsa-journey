package Beginner.Patterns;

//Take an integer N as input, print the corresponding Full Numeric Pyramid pattern for N.
//For example if N = 5 then pattern will be like:
//        0 0 0 0 5 0 0 0 0
//        0 0 0 4 8 12 0 0 0
//        0 0 3 6 9 12 15 0 0
//        0 2 4 6 8 10 12 14 0
//        1 2 3 4 5 6 7 8 9
//NOTE: There should be exactly one extra space after each number for each row.

import java.util.Scanner;

public class DifferentNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++) {
            int zeroes = N-i;
            int multiplier = N-i+1;
            int count = 2*i-1;
            //left zeroes
            for(int j=0;j<zeroes;j++) {
                System.out.print("0 ");
            }
            // middle: multiplication table
            for (int j = 1; j <= count; j++) {
                System.out.print(multiplier * j + " ");
            }
            // right zeros
            for (int j = 0; j < zeroes; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

}
