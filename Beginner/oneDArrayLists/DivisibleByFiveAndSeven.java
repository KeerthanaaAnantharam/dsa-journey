package Beginner.oneDArrayLists;

//Write a program that returns the list of elements that are present in the given list
//and are divisible by 5 and 7.

import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleByFiveAndSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> result = solve(list);
        System.out.println(result);
        sc.close();
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (num % 5 == 0 && num % 7 == 0) {
                result.add(num);
            }
        }
        return result;
    }
}
