package Beginner.oneDArrayLists;

//You are given an integer array A.
//You have to find the second-largest element/value in the array
//or report that no such element exists.

import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargest {
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
        int N = arrList.size();
        if(N<=1) {
            return -1;
        } else {
            int max = 0;
            int second = 0;
            for(int X: arrList) {
                if(X > max) {
                    second = max;
                    max = X;
                } else if (X > second) {
                    second = X;
                }
            }
            return second;
        }
    }
}
