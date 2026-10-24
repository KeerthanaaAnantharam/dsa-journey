package Beginner.twoDArrays;

//You are given a 2D matrix A of integers.
//Your task is to compute the sum of elements in each row and return a 1D array
//where each element represents the sum of a corresponding row in the matrix.

import java.util.Scanner;

public class RowSum {
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
        int[] ans = rowSum(A);
        for(int a: ans) {
            System.out.println(a);
        }
    }

    public static int[] rowSum(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[] ans = new int[rows];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                ans[i] += A[i][j];
            }
        }
        return ans;
    }
}
