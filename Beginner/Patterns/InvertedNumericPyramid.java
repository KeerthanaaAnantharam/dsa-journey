package Beginner.Patterns;
//Take an integer N as input,
// print the corresponding Numeric Inverted Half Pyramid pattern for N.
//    For example if N = 4 then pattern will be like:
//    1 2 3 4
//    1 2 3
//    1 2
//    1

import java.util.Scanner;

public class InvertedNumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=N-i+1;j++) {
                System.out.print(j);
                if(j!=N-i+1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
