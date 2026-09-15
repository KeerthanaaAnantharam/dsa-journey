//You are given an integer N you need to print all the Prime Numbers between 1 and N.
//Prime numbers are numbers that have only 2 factors: 1 and themselves.
//For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.

import java.lang.*;
import java.util.*;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(i=1;i<=N;i++) {
            int count = 0;
            for(int j=1;j<=i;j++) {
                if(i%j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.print(i)
            }
        }
    }
}