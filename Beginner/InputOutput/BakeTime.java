package Beginner.InputOutput;
//You're going to write some code to help you cook a gorgeous lasagna
//from your favorite cookbook. According to your cookbook, the Lasagna should be
//in the oven for 40 minutes. Given the time (in minutes), the lasagna has been in the oven,
//find how many more minutes the lasagna still needs to bake for.

import java.lang.*;
import java.util.*;

public class BakeTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<=40) {
            System.out.println(N-40);
        }
    }
}