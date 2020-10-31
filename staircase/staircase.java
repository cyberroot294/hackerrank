import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 * staircase
 */
public class staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                if (j < i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        in.close();
    }

}