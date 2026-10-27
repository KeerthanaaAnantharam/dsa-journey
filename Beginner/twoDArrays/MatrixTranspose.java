package Beginner.twoDArrays;

//Given a 2D integer array A, return the transpose of A.
//The transpose of a matrix is the matrix flipped over its main diagonal,
//switching the matrix's row and column indices.

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][M];
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[][] res = transposeMatrix(A);
        for(int i=0;i<res.length;i++) {
            for(int j=0;j<res[0].length;j++) {
                System.out.print(res[i][j]);
            }
        }
    }

    public static int[][] transposeMatrix(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] transA = new int[cols][rows];

        for(int i=0;i<cols;i++) {
            for(int j=0;j<rows;j++) {
                transA[i][j] = A[j][i];
            }
        }
        return transA;
    }
}
