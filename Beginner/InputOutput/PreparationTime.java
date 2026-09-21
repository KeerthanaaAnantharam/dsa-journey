package Beginner.InputOutput;
//You'll write some code to help you cook a gorgeous lasagna from your favorite cookbook.
//Now, you also want to add a few layers to the lasagna.
//Assume **each layer takes 2 minutes** to prepare.
//Given the number of layers you want to add to the lasagna,
//find how many minutes you would spend making them.

import java.lang.*;
import java.util.*;

public class PreparationTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N*2);
    }
}