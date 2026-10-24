package Beginner.twoDArrays;

//You are given two matrices A & B of same size, you have to return another matrix
// which is the sum of A and B.
//Note: Matrices are of same size means the number of rows and number of columns
// of both matrices are equal.

import java.util.Scanner;

public class AddMatrices {
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
        int[][] sum = addMatrices(A,B);
        for(int i=0;i<X;i++) {
            for(int j=0;j<Y;j++) {
                System.out.println(sum[i][j]);
            }
        }
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] sum = new int[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
    }
}
