package Beginner.IfElse;
//You are given a Bank account having N amount and
// you are asked to perform ADD(credit) or SUBTRACT(debit) operation of an amount X.
//After the operation print the amount left in the Bank account.
// If the debit amount is greater than current balance
// print "Insufficient Funds"(without quotes) and the operation is skipped.

import java.lang.*;
import java.util.*;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int balance = sc.nextInt();
        int type = sc.nextInt();

        int credit = amount + balance;
        int debit = balance - amount;
        if (type == 1) {
            System.out.print(credit);
        }
        if (type == 2 && (amount < balance)) {
            System.out.print(debit);
        }
        if (type == 2 && (amount > balance)) {
            System.out.print("Insufficient Funds");
        }
    }
}

