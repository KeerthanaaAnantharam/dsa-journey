package Beginner.oneDArrayLists;
//You are given an integer array A, you have to return an integer array of same size
//whose ith element is the frequency count of A[i] in array A.

import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++) {
            A.add(sc.nextInt());
        }
        ArrayList<Integer> res = frequencyCount(A);
        System.out.println(res);
    }

    public static ArrayList<Integer> frequencyCount(ArrayList<Integer> arrList) {
        int N = arrList.size();
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer integer : arrList) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (integer.equals(arrList.get(j))) {
                    count++;
                }
            }
            res.add(count);
        }
        return res;
    }
}
