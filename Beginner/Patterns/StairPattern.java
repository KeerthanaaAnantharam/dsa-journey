//Take an integer N as input, print the corresponding stair pattern for N.
//For example if N = 4 then stair pattern will be like:
//     *
//     **
//     ***
//     ****

public class StairsPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<=N;i++) {
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}