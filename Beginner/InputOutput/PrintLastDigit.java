package Beginner.InputOutput;
//Given an integer in the input print its last digit.

import java.lang.*;
import java.util.*;

public class PrintLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N%10);
    }
}