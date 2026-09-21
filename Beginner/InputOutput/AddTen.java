package Beginner.InputOutput;
//You will be given an integer in the input.
//You need to add 10 to it and print the result to the output.

import java.lang.*;
import java.util.*;

public class AddTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N+10);
    }
}