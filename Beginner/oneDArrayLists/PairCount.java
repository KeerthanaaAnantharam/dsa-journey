package Beginner.oneDArrayLists;

//You are given an integer array A and an integer B.
//You are required to return the count of pairs having sum equal to B.
//NOTE: pair (i,j) and (j,i) are same.

import java.util.ArrayList;
import java.util.Scanner;

public class PairCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++) {
            A.add(sc.nextInt());
        }
        int B = sc.nextInt();
        int ans = countPair(A, B);
        System.out.println(ans);
    }

    public static int countPair(ArrayList<Integer> A, int B) {
        int N = A.size();
        int count = 0;
        for(int i=0;i<N-1;i++) {
            for(int j=i+1;j<N;j++) {
                if(A.get(i)+A.get(j) == B) {
                    count++;
                }
            }
        }
        return count;
    }
}
