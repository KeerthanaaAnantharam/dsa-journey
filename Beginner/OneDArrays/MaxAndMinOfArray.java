package Beginner.OneDArrays;

//Take input an array A of size N and write a program to print maximum and minimum elements
//of the input. The only line of the input would contain a single integer N
//that represents the length of the array followed by the N elements of the input array A.

import java.util.Scanner;

public class MaxAndMinOfArray {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        int[] res = solve(A);
        System.out.print(res[0] + " " +res[1]);
    }

    public static int[] solve(int[] A) {
        int max = A[0];
        int min = A[0];
        for (int j : A) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        return new int[]{max, min};
    }
}
