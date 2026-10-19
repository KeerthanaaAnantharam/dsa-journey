package Beginner.OneDArrays;

//You are given an integer T denoting the number of test cases. For each test case,
//you are given an integer array A.
//You have to print the odd and even elements of array A in 2 separate lines.
//NOTE: Array elements should have the same relative order as in A.

import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- >0){
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i=0;i<N;i++) {
                A[i] = sc.nextInt();
            }
            System.out.println(solve(A, true));
            System.out.println(solve(A, false));
        }
    }

    public static String solve(int[] A, boolean checkOdd) {
        StringBuilder sb = new StringBuilder();

        if(checkOdd) {
            for(int a: A) {
                if(a%2 != 0) {
                    sb.append(a).append(" ");
                }
            }
        } else {
            for(int a: A) {
                if(a%2 == 0) {
                    sb.append(a).append(" ");
                }
            }
        }
        return sb.toString().trim();
    }
}
