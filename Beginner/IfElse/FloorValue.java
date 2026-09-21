package Beginner.IfElse;
//Given two numbers A and B. Print the floor of A/B.

import java.lang.*;
import java.util.*;

public class FloorValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.print((int)(Math.floor(A/B)));
    }
}