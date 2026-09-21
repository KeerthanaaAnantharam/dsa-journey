package Beginner.Patterns;
//Take an integer N as input, print the corresponding stair pattern for N.
//For example if N = 4 then stair pattern will be like:
//     *
//     **
//     ***
//     ****

import java.lang.*;
import java.util.*;

public class StairPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<=N;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}