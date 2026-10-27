package Beginner.twoDArrays;
//You are given a matrix A and and an integer B,
//you have to perform scalar multiplication of matrix A with an integer B.

import java.util.Scanner;

public class ScalarProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] A = new int[R][C];
        for(int i=0;i<R;i++) {
            for(int j=0;j<C;j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int B = sc.nextInt();
        int[][] ans = solve(A,B);
        for(int i=0;i<R;i++) {
            for(int j=0;j<C;j++) {
                System.out.print(ans[i][j]);
            }
        }
    }

    public static int[][] solve(int[][]A, int B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] res = new int[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                res[i][j] = A[i][j] * B;
            }
        }
        return res;
    }
}
