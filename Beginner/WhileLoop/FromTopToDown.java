package Beginner.WhileLoop;
//Write a program that takes a positive integer N as input from the user and
//prints all natural numbers from 1 to N,
//with each number followed by a space (including the last number).

import java.lang.*;
import java.util.*;

public class FromTopToDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while(i<=N) {
            System.out.print(i + " ");
            i++;
        }
    }
}