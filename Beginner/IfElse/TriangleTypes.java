package Beginner.IfElse;
//Write a program to input from user three numbers(A, B & C)
//representing side lengths of a triangle.
//You have to print if the traingle is "equilateral", "scalene" or "isosceles".

import java.lang.*;
import java.util.*;

public class TriangleTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A==B && A==C) {
            System.out.println("Equilateral");
        } else if(A==B || A==C || B==C) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}