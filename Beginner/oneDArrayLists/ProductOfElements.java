package Beginner.oneDArrayLists;

//Write a program that returns the product of all elements present in the array.

import java.util.ArrayList;
import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++) {
            A.add(sc.nextInt());
        }
        int ans = solve(A);
        System.out.print(ans);
    }

    public static int solve(ArrayList<Integer> arrList) {
        int res = 1;
        for (Integer integer : arrList) {
            res = res * integer;
        }
        return res;
    }
}
