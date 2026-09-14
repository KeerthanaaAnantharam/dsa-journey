/*Take two names A and B as input from the user,
print "A says Hi to B" (Without quotations),
where A and B are the names in input.*/

/* 1 <= len(A), len(B) <= 15
Characters in A and B are in lowercase English Alphabets.*/

import java.lang.*;
import java.util.*;

public class ASaysHiToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.nect();
        System.out.print(A+ "says Hi To" +B);
    }
}
