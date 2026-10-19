package Beginner.OneDArrays;

//You are given a constant array A and an integer B.
//You are required to return another array where outArr[i] = A[i] + B.

import java.util.Scanner;

public class CopyTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int[] outArr = solve(A,B);
        for (int j : outArr) {
            System.out.print(j);
        }
    }

    public static int[] solve(int[] A, int B) {
        int N = A.length;
        for(int i=0;i<N;i++) {
            A[i] = A[i] + B;
        }
        return A;
    }
}
