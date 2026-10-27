package Beginner.twoDArrays;

//You are given a N X N square integer matrix A.
//You have to tell whether A is an identity matrix or not.
//Identity matrix is a special square matrix whose main diagonal elements are equal to 1
//and all other elements are 0.

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int ans = solve(A);
        System.out.print(ans);
    }

    public static int solve(int[][] A) {
        int N = A.length;
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(i==j) {
                    if(A[i][j] != 1) return 0;
                } else {
                    if(A[i][j] != 0) return 0;
                }
            }
        }
        return 1;
    }
}
