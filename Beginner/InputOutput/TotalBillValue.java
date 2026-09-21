package Beginner.InputOutput;
//Given the value of a single bill and the number of bills you received,
//print the total value of the bills.

import java.lang.*;
import java.util.*;

public class TotalBillValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.print(N*M);
    }
}