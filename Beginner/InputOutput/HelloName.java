package Beginner.InputOutput;
//Take a name A as input from the user and print "Hello A", where A is the name in input.

import java.lang.*;
import java.util.*;

public class HelloName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.print("Hello " +A);
    }
}