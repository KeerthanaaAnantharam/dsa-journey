package Beginner.Functions;

//You will be given an integer n.
//You need to return the count of prime numbers less than or equal to n.

import java.util.Scanner;

public class CountPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = countPrimes(n);
        System.out.println(ans);
    }

    public static int countPrimes(int N) {
        if (N < 2) return 0;
        int count = 0;
        for(int i=2;i<=N;i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int X) {
        if (X < 2) return false;
        for(int i=2; i * i <= X;i++) {
            if(X%i == 0) {
                return false;
            }
        }
        return true;
    }

    // this problem is solved using sieve of eratosthenes method.
}
