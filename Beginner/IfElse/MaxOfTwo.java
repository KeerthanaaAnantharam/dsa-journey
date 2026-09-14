//Write a program to input two numbers(A & B) from user and
//print the maximum element among A & B.

import java.lang.*;
import java.util.*;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A>B) {
            System.out.print(A);
        } else {
            System.out.print(B);
        }
    }
}