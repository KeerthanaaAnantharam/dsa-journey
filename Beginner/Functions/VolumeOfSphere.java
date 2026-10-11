package Beginner.Functions;

//You are given a positive integer A denoting the radius of a sphere.
//You have to calculate the volume of the sphere.
//Volume of a sphere having radius R is given by (4 * π * R3) / 3.
//NOTE: Since, the answer can be a real number, you have to return the ceil value of the volume.
//Ceil value of a real number X is the smallest integer that is greater than or equal to X.

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int ans = calcVolume(A);
        System.out.println(ans);
    }

    public static int calcVolume(int A) {
        double PI = 3.1416;
        double volume = (4 * PI * A * A * A) / 3;
        return (int)Math.ceil(volume);
    }
}
