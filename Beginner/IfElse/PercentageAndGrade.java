package Beginner.IfElse;
//Write a program to calculate the percentage (according to marks of a student)
// and grade (according to the percentage of a student).
// Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects
// which are out of 100. Print the percentage and the grade of the student.
//        If percentage >= 90% : Grade A
//        If percentage >= 80% but <90 : Grade B
//        If percentage >= 70% but <80: Grade C
//        If percentage >= 60% but <70: Grade D
//        If percentage >= 40% but <60: Grade E
//        If percentage < 40%: Grade F
//        NOTE: You have to take the lowest integer of the percentage.
//        E.g. 90.8% will be treated as 90%.

import java.util.Scanner;

public class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        int sum = p+q+r+s+t;
        int percent = sum/5;
        System.out.println(percent);

        if (percent >= 90) {
            System.out.print("A");
        } else if (percent >= 80 && percent < 90) {
            System.out.print("B");
        } else if (percent >=70 && percent < 80) {
            System.out.print("C");
        } else if (percent >=60 && percent < 70) {
            System.out.print("D");
        } else if (percent >= 40 && percent < 60) {
            System.out.print("E");
        } else if (percent < 40) {
            System.out.print("F");
        }
    }
}
