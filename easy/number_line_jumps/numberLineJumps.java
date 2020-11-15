import java.util.Scanner;

/**
 * numberLineJumps
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */
public class numberLineJumps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        System.out.println(numberLineJumps(x1, v1, x2, v2));
        in.close();
    }

    public static String numberLineJumps(int x1, int v1, int x2, int v2) {
        return (v1 > v2 && (x1 - x2) % (v2 - v1) == 0 ? "YES" : v2 == v1 && (x1 % 2 == x2 % 2) ? "YES" : "NO");
    }
}