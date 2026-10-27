package Beginner.twoDArrays;

//You are given two integer matrices A(having M X N size) and B(having N X P).
//You have to multiply matrix A with B and return the resultant matrix.
//        (i.e. return the matrix AB).

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[][] A = new int[M][N];
        int[][] B = new int[N][P];

        for(int i=0;i<M;i++) {
            for(int j=0;j<N;j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<N;i++) {
            for(int j=0;j<P;j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] C = matrixProduct(A, B);
        for(int i=0;i<M;i++) {
            for(int j=0;j<P;j++) {
                System.out.print(C[i][j]);
            }
        }
    }

    public static int[][] matrixProduct(int[][] A, int[][] B) {
        int M = A.length;
        int N = A[0].length; //also B.length
        int P = B[0].length;
        int[][] ans = new int[M][P];

        for(int i=0;i<M;i++) {
            for(int j=0;j<P;j++) {
                int sum = 0;
                for(int k=0;k<N;k++) {
                    sum += A[i][k] * B[k][j];
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}
