package Beginner.InputOutput;
//Given two numbers A and B. Print A+B, A*B, A-B, A/B in the same order.

import java.lang.*;
import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println((A+B) + " ");
        System.out.println((A*B) + " ");
        System.out.println((A-B) + " ");
        System.out.println((A/B) + " ");
    }
}