//Write a program to input an integer(A) from user and print the Ath month of the year.
//Months list: {January, February, March, April, May, June, July, August, September,
// October, November, December}

import java.lang.*;
import java.util.*;

public class PrintMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A==1){
            System.out.print("January");
        } else if(A==2){
            System.out.print("February");
        } else if(A==3){
            System.out.print("March");
        } else if(A==4){
            System.out.print("April");
        } else if(A==5){
            System.out.print("May");
        } else if(A==6){
            System.out.print("June");
        } else if(A==7){
            System.out.print("July");
        } else if(A==8){
            System.out.print("August");
        } else if(A==9){
            System.out.print("September");
        } else if(A==10){
            System.out.print("October");
        } else if(A==11){
            System.out.print("November");
        } else if(A==12){
            System.out.print("December");
        }
    }
}