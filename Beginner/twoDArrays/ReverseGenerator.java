package Beginner.twoDArrays;
//Given an array A, Find the reverse of it. Do not modify the original array.

import java.util.Scanner;

public class ReverseGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        int[] ans = reverseArray(A);
        for(int a: ans) {
            System.out.print(a);
        }
    }

    public static int[] reverseArray(int[] A) {
        int N = A.length;
        int[] B = new int[N];

        for(int i=0;i<N;i++) {
            B[i] = A[N-1-i];
        }
        return B;
    }
}
