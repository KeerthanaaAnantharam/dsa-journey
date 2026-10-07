package Beginner.Patterns;

//Take an integer N as input, print the corresponding Half Diamond pattern with 2*N - 1 rows.
//        For example if N = 5 then pattern will be like:
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
//        NOTE: There should be no spaces after any * .

import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=2*N-1;i++) {
            // stars in this row
            int stars = (i <= N) ? i : 2 * N - i;
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < stars; j++) {
                row.append('*');
            }
            System.out.println(row);
        }
    }
}
