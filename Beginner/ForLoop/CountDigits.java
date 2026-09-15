//Take T (number of test cases) as input.
//For each test case, take integer N as input and
// Print the count of digits of that number.
//Note: No of digits for number 0 is considered as 1.

import java.lang.*;
import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=1;t<=T;t++) {
            int N = sc.nextInt();
            if (N == 0) {
                count = 1;
            } else {
                for (; n > 0; n /= 10) {
                    count++;
                }
            }
            Sytem.out.print(count);
        }
    }
}