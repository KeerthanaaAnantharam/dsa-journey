package Beginner.Functions;

//Take a number A as input in binary format (Base = 2).
//You have to print the number in decimal format (Base = 10).

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int res = solve(A);
        System.out.print(res);
    }

    public static int solve(int N) {
       int ans = 0;
       int power = 1;

       while(N > 0) {
           int digit = N % 10;
           ans += digit * power;
           power *= 2;
           N /= 10;
       }
        return ans;
    }

}
