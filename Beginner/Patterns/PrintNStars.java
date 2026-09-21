package Beginner.Patterns;
//Given an integer N, print N stars in a single line.
//For example if N = 5 then pattern will be like:
//*****

import java.lang.*;
import java.util.*;

public class PrintNStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<=N;i++) {
            System.out.print("*");
        }
    }
}