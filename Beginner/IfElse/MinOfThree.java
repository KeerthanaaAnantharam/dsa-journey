package Beginner.IfElse;
//Write a program to input three numbers(A, B & C) from user and
//print the minimum element among A, B & C.

import java.lang.*;
import java.util.*;

public class MinOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A<B && A<C) {
            System.out.print("A");
        } else if(B<A && B<C) {
            System.out.print("B");
        } else {
            System.out.print("C");
        }
    }
}