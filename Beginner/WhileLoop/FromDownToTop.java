package Beginner.WhileLoop;
//Write a program to print all Natural numbers from N to 1
//where you have to take N as input from user

import java.lang.*;
import java.util.*;

public class FromDownToTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while(N>=i) {
            System.out.print(N + " ");
            N--;
        }
    }
}
