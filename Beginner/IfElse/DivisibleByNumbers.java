//Take an integer A as input.
//You have to tell whether A is divible by both 5 and 11 or not.

import java.lang.*;
import java.util.*;

public class DivisibleByNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if((A%5 == 0) && (A%11 == 0)) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}