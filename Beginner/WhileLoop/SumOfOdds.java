//Take an integer A as input.
//You have to print the sum of all odd numbers in the range [1, A].

import java.lang.*;
import java.util.*;

public class SumOfOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=A) {
            if(i%2 == 0) {
                sum = sum+i;
            }
            i++;
        }
        System.out.print(sum);
    }
}