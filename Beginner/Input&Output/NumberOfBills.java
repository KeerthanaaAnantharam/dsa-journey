//Given total bills amount and amount of a single bill. Print number of bills.

import java.lang.*;
import java.util.*;

public class NumberOfBills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float N = sc.nextFloat();
        int M = sc.nextInt();
        System.out.print((int)N/M);
    }
}