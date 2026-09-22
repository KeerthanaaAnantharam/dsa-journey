package Beginner.Patterns;

import java.util.Scanner;

//Take an integer N as input, print the corresponding pattern for N.
//For example if N = 5 then pattern will be like:
//        *****
//        *   *
//        *   *
//        *   *
//        *****
public class PhotoFramePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++) {
            if(i==1 || i ==N) {
                for (int j=1; j<=N;j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j=1;j<=(N-2);j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
