package Beginner.ForLoop;
//You take a number of test cases, denoted by T as input.
//For each test case, you should take integers N as input.
//Your task is to calculate and print the sum of the digits of the given number N.

import java.lang.*;
import java.util.*;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=1;t<=T;t++) {
            int N = sc.nextInt();
            int sum = 0;
            if(N==0) {
                sum = 0;
            } else {
                for(;N>0;N/=10) {
                    sum += N % 10;
                }
            }
            System.out.println(sum);
        }
    }
}