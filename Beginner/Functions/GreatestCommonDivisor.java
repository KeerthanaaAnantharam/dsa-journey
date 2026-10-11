package Beginner.Functions;

//Given 2 non-negative integers A and B, find gcd(A, B)
//GCD of 2 integers A and B is defined as the greatest integer 'g' such that
// 'g' is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.
// Note: DO NOT USE LIBRARY FUNCTIONS.

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int res = gcd(A, B);
        System.out.println(res);
    }

    public static int gcd(int A, int B) {
        while (B !=0 ) {
            int rem = A % B;
            A = B;
            B = rem;
        }
        return A;
    }

    //this problem is solved using Euclidean Algorithm
}
