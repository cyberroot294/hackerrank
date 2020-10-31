
/**
 * diagonalDifference
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
import java.util.*;

public class diagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        diagonalDifference(arr, n);
        in.close();
    }

    public static void diagonalDifference(int[][] arr, int n) {
        int d1 = 0;
        for (int i = 0; i < n; i++) {
            d1 += arr[i][i];
            arr[i][i] = arr[i][n - 1 - i];
            d1 -= arr[i][i];
        }
        d1 = Math.abs(d1);
        System.out.println(d1);
    }
}