package Beginner.IfElse;
//Write a program to input an integer from user and print 1 if it is odd otherwise print 0.

import java.lang.*;
import java.util.*;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%2==0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}