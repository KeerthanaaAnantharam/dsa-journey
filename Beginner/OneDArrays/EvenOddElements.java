package Beginner.OneDArrays;

//You are given T(number of test cases) integer arrays.
//For each array A, you have to find the value of absolute difference between
//the counts of even and odd elements in the array.

import java.util.Scanner;

public class EvenOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- >0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i=0;i<N;i++) {
                A[i] = sc.nextInt();
            }
            int ans = absDiff(A);
            System.out.print(ans);
        }
    }

    public static int absDiff(int[] A) {
        int even = 0, odd = 0;
        for(int a: A) {
            if(a%2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.abs(even-odd);
    }
}
