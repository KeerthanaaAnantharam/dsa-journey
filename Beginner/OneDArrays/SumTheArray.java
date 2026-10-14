package Beginner.OneDArrays;

//Write a program to print sum of elements of the input array A of size N.
//Note: User is supposed to write a program from scratch to add the elements of the input array
// and print the result.

import java.util.Scanner;

public class SumTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        int ans = sumArray(A);
        System.out.println(ans);
    }

    public static int sumArray(int[] A) {
        int N = A.length;
        int sum = 0;
        for(int i=0;i<N;i++) {
            sum = sum+A[i];
        }
        return sum;
    }
}
