package Beginner.twoDArrays;

//You are given a 2D integer matrix A,
//return a 1D integer array containing column-wise sums of original matrix.

import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[][] A = new int[X][Y];
        for(int i=0;i<X;i++) {
            for(int j=0;j<Y;j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[] ans = columnSum(A);
        for(int a: ans) {
            System.out.print(a);
        }
    }

    public static int[] columnSum(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[] ans = new int[cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                ans[i] += A[j][i];
            }
        }
        return ans;
    }
}
