package Beginner.Functions;

//You are given a positive integer A denoting the radius of a circle.
//You have to calculate the area of the circle.
//Note :
//
//The formula for the area of a circle is Area = πr²,
//where r is the radius of the circle.
//You can use the value of PI as 3.1416
//Round up the final answer up to 2 decimal places.
//You can use round(area, 2) it for rounding area to 2 decimal places

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        double res = calcArea(A);
        System.out.println(res);
    }

    public static double calcArea(int A) {
        double PI = 3.1416;
        double area = PI * A * A;
        return Math.round(area * 100.0) / 100.0;
    }
}
