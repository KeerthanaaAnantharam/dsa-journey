//Take a number A as input, print its multiplication table having the first 10 multiples.

import java.lang.*;
import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int i = 1;
        while(i<=10) {
            System.out.println(N + " " + "*" + " " + i + " " + "=" + " "+ (N*i));
            i++;
        }
    }
}