package Beginner.InputOutput;//Given 5 numbers A, B, C, D, E as input.
//Print the average of these 5 numbers (correct up to 2 decimal places).

import java.lang.*;
import java.util.*;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float D = sc.nextFloat();
        float E = sc.nextFloat();
        int sum = (int) (A + B + C + D + E);
        float avg = (float) sum / 5;
        System.out.println(String.format("%.2f", avg));
    }
}