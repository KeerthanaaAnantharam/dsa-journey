package Beginner.Patterns;
//Print a pattern consisting of N rows, where each row contains an asterisk (*)
// at the beginning and end of the line, with N-2 spaces in between.
// The Pattern should look like:
//   *<N-2 Spaces>*
// Print the above pattern for a total of N Rows.

import java.util.Scanner;

public class TwoLineStarPattern {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<=N;i++) {
            System.out.print("*");
            for(int j=1;j<=N-2;j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

    }
}
