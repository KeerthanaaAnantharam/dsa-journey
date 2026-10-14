package Beginner.OneDArrays;

/*
Write a program to input N numbers array, a number X and a number Y from user
and insert an element Y in it at specified position X. X is based on 1-based indexing
Note: When an element is inserted at position X, all elements that were already
present at position >= X, gets shifted to one position right, not replaced.

Problem Constraints
1 <= N <= 100
1 <= A[i] <= 1000
1 <= X <= N
1 <= Y <= 1000

Input Format
First line is N which represents number of elements.
Second line contains N space separated integers.
Third line is X position where Y has to be inserted.
Fourth line is Y which is the value to be inserted.

Output Format
N+1 space separated integers of the input array after inserting the element at
required position.

Example Input
Input 1:
   5
   2 3 1 4 2
   3
   5
Example Output 1:
2 3 5 1 4 2
Example Explanation 1:
Clearly after inserting 5 at 3rd position, new array is 2 3 5 1 4 2.
*/

import java.util.Scanner;

public class InsertThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt(); // 1 based index position
        int y = sc.nextInt(); // value to insert
        int res[] = insertElement(arr, x, y);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=N;i++) {
            sb.append(res[i]);
            if (i < N) sb.append(" ");
        }
        System.out.println(sb);
    }

    public static int[] insertElement(int[] A, int X, int Y) {
        int N = A.length;
        int idx = X-1; //making it 0 based
        for(int i=N-1;i>idx;i--) {
            A[i] = A[i-1];
        }
        A[idx] = Y;
        return A;
    }
}
/* the problem required more attention from me, it took time for me to understand the logic.
take an array of size N+1 , to accomodate the new element.
we are shifting elements from backwards to add the new element.
 TC = 0(N);
 SC = 0(N);
*/