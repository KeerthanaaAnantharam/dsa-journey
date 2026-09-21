package Beginner.IfElse;
//You are given the Cost Price C and Selling Price S of a Product.
//You have to tell whether there is a Profit or Loss.
//Also, calculate total profit or loss.
//NOTE: It is guaranteed that Cost Price and Selling Price are not equal.
//NOTE: You have to take input of the Cost Price(C) and Selling Price(S) from the user.

import java.lang.*;
import java.util.*;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int S = sc.nextInt();

        if(S>C) {
            System.out.println("1");
            System.out.println(S-C);
        } else {
            System.out.println("-1");
            System.out.println(Math.abs(S-C));
        }
    }
}