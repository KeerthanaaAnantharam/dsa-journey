package Beginner.oneDArrayLists;

//Given an array A, check if it is sorted in non-decreasing order or not.
//Non-decreasing order means that the numbers in a sequence can stay the same or increase,
//but they cannot decrease.

import java.util.ArrayList;
import java.util.Scanner;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++) {
            A.add(sc.nextInt());
        }
        int ans = checkArray(A);
        System.out.println(ans);
    }

    public static int checkArray(ArrayList<Integer> arrList) {
        int N = arrList.size();
        for(int i=1;i<N;i++) {
            if(arrList.get(i) < arrList.get(i-1)) {
                return 0;
            }
        }
        return 1;
    }
}
