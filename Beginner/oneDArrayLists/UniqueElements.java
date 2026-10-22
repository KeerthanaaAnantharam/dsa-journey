package Beginner.oneDArrayLists;

//You are given an integer T (Number of test cases). For each test case,
//You are given an integer array A.
//You have to find all the values that are uniquely present in the array
//i.e, values having number of occurrences = 1.

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            for(int i=0;i<N;i++) {
                A.add(sc.nextInt());
            }
            ArrayList<Integer> res = uniqueElements(A);
            System.out.println(res);
        }

    }

    public static ArrayList<Integer> uniqueElements(ArrayList<Integer> arrList) {
        int N = arrList.size();
        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer integer : arrList) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (integer.equals(arrList.get(j))) {
                    count++;
                }
            }
            if (count == 1) {
                ans.add(integer);
            }
        }
        return ans;
    }
}
