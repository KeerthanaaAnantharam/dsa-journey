package Beginner.twoDArrays;
//You are given two integer matrices A and B having same size(Both having same number of rows (N)
//and columns (M).You have to subtract matrix B from A and return the resultant matrix.
//(i.e. return the matrix A - B).
//If A and B are two matrices of the same order (same dimensions).
//Then A - B is a matrix of the same order as A and B and
//its elements are obtained by doing an element wise subtraction of A from B.

import java.util.Scanner;

public class SubtractMatrices {
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
        int[][] B = new int[X][Y];
        for(int i=0;i<X;i++) {
            for(int j=0;j<Y;j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int[][] ans = subtractMatrices(A, B);
        for(int i=0;i<X;i++) {
            for(int j=0;j<Y;j++) {
                System.out.print(ans[i][j]);
            }
        }
    }

    public static int[][] subtractMatrices(int[][] A, int[][]B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] res = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                res[i][j] = A[i][j] - B[i][j];
            }
        }
        return res;
    }
}
