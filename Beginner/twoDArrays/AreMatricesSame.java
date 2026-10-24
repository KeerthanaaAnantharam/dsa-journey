package Beginner.twoDArrays;

//You are given two matrices A and B of equal dimensions and you have to check
//whether two matrices are equal or not.
//NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j.

import java.util.Scanner;

public class AreMatricesSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[][] A = new int[X][Y];
        for(int i=0;i<X;i++){
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
        System.out.println(solve(A,B));
    }

    public static int solve(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(A[i][j] == B[i][j]) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
