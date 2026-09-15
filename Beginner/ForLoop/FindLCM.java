//Write a function that takes two positive integers A and B and returns their LCM.

import java.lang.*;
import java.util.*;

public class FindLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int lowerLimit = Math.max(A, B);
        int upperLimit = A * B;
        int lcm = 0;

        for(int i=lowerLimit;i<=upperLimit;i++) {
            if (i%A == 0 && i%B == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
}