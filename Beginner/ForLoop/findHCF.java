package Beginner.ForLoop;
//Write a program to input an integer T which represents the number of test cases.
//For each test case input two integers A and B in two different lines.
//For each pair of A and B print the HCF of the given two numbers.

import java.lang.*;
import java.util.*;

public class findHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=1;t<=T;t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int hcf = 1;
            for(int i=1;i<=Math.min(A,B);i++) {
                if(A%i==0 && B%i==0) {
                    hcf = i;
                }
            }
            System.out.println(hcf);
        }
    }
}