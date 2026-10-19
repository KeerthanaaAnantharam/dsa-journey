package Beginner.OneDArrays;

//Given an array of integers A of size N and an integer B,
//determine whether the element B exists in the array A or not.
//If it exists, print 1; otherwise, print 0.
//This needs to be processed for T independent test cases.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class SearchElement {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        int t = nextInt(st);
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(st);
            int b = nextInt(st);

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt(st);
            }

            sb.append(search(a, b)).append("\n");
        }

        System.out.print(sb);
    }

    public static int nextInt(StreamTokenizer st) {   // throws removed
        try {
            st.nextToken();
            return (int) st.nval;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int search(int[] a, int b) {
        for (int j : a) {
            if (j == b) {
                return 1; // found: no need to look further
            }
        }
        return 0; // checked everything, not found
    }

}
