//You are given 3 integer angles(in degrees) A, B and C of a triangle.
// You have to tell whether the triangle is valid or not.
//A triangle is valid if sum of its angles equals to 180.
//NOTE: You have to take the input of 3 angles of triangle from the user.

import java.lang.*;
import java.util.*;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A+B+C;
        if(sum == 180) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
