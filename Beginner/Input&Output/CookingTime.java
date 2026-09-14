//You wrote some code to help you cook a gorgeous lasagna from your favorite cookbook.
//Now, you want to find the total number of minutes you've been cooking for
//the sum of your preparation time and the time the lasagna has already spent baking in the oven.
//The preparation time of one layer is 2 minutes.
//Given the number of layers added to the lasagna
//and the number of minutes the lasagna has been baking in the oven,
//find the total elapsed cooking time (prep + bake) in minutes.

import java.lang.*;
import java.util.*;

public class CookingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println((N*2)+M);
    }
}