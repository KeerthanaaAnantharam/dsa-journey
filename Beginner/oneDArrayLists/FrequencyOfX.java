package Beginner.oneDArrayLists;

//Given an integer array A (Array of bigInt).
//Find and return the frequency of number B in array A.

import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyOfX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++) {
            A.add(sc.nextInt());
        }
        int B = sc.nextInt();
        int ans = frequency(A,B);
        System.out.println(ans);
    }
    public static int frequency(ArrayList<Integer> A, int B) {
        int count = 0;
        for (Integer integer : A) {
            if (integer == B) {
                count++;
            }
        }
        return count;
    }
}
