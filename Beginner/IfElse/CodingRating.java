package Beginner.IfElse;
//Write a program to input from user an integer(n) representing the rating of a person on a platform.
//You have to print the category of that person.
//If the rating is greater than or equal to 2100 then that person is "grand master".
//If the rating is greater than or equal to 1900 then that person is "candidate master".
//If the rating is greater than or equal to 1600 then that person is "expert".
//If the rating is greater than or equal to 1400 then that person is "pupil".
//If the rating is smaller than 1400 then that person is "newbie".
//NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise print in UPPERCASE

import java.lang.*;
import java.util.*;

public class CodingRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A%2 == 0 && A>=2100) {
            System.out.print("GRAND MASTER");
        } else if (A%2 !=0 && A>=2100) {
            System.out.print("grand master");
        } else if(A%2 == 0 && A>=1900) {
            System.out.print("CANDIDATE MASTER");
        } else if (A%2 !=0 && A>=1900) {
            System.out.print("candidate master");
        }else if(A%2 == 0 && A>=1600) {
            System.out.print("EXPERT");
        } else if (A%2 !=0 && A>=1600) {
            System.out.print("expert");
        } else if(A%2 == 0 && A>=1400) {
            System.out.print("PUPIL");
        } else if (A%2 !=0 && A>=1400) {
            System.out.print("pupil");
        } else if(A%2 == 0 && A<1400) {
            System.out.print("NEWBIE");
        } else if (A%2 !=0 && A<1400) {
            System.out.print("newbie");
        }
    }
}