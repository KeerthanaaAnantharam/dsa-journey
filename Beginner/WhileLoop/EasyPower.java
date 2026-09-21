package Beginner.WhileLoop;
//You are given two integers A and B. You have to find the value of AB.
//NOTE: The value of AB will always be less than or equal to 109.

import java.lang.*;
import java.util.*;

public class EasyPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        long result = 1;
        int i = 1;
        while(i<=B) {
            result = result * A;
            i++;
        }
        System.out.println(result);
    }
}
