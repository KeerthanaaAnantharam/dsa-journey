package Beginner.oneDArrayLists;

//Write a function to check if the given array A has consecutive duplicate elements or not.
//Return True if there are consecutive duplicate elements in the list else return False.
//Here by consecutive duplicates, we mean duplicates that are present at consecutive indices in the array

import java.util.ArrayList;
import java.util.Scanner;

public class ConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++) {
            A.add(sc.nextInt());
        }
        boolean ans = checkDuplicates(A);
        System.out.print(ans);
    }
    public static boolean checkDuplicates(ArrayList<Integer> arrList) {
        int N = arrList.size();
        for(int i=0;i<N;i++) {
            if(arrList.get(i).equals(arrList.get(i+1))) {
                return true;
            }
        }
        return false;
    }
}
