package Beginner.WhileLoop;
//Write a program to print all odd numbers from 1 to N
// where you have to take N as input from user.
// Here N is inclusive.
//Note:Each number should be followed by a space, including the last number.

import java.lang.*;
import java.util.*;

public class OddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i =1;

        while(i<=N) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}