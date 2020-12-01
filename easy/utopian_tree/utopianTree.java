import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/utopian-tree/problem
 * utopianTree
 */

//  first, just check if period is an even number, so height of next period is the double from previous height.
//  loop until n period 
public class utopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int temp = in.nextInt();
            int res = 1;
            if (temp == 0)
                System.out.println(res);
            else {
                for (int j = 1; j <= temp; j++) {
                    if (j % 2 == 1)
                        res *= 2;
                    else
                        res++;
                }
                System.out.println(res);
            }
        }
    }
}